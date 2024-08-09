package acbatools;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Database {
    
    private Connection conn = null;
    private PreparedStatement pstm = null;
    private ResultSet rs = null;

    public void CreateTable() {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS ACBAExpenses_Table("
                + "record_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "date DATE,"
                + "personnel_name VARCHAR(255),"
                + "petty_cash DECIMAL(10, 0),"
                + "diesel DECIMAL(10, 0),"
                + "meal DECIMAL(10, 0),"
                + "parking DECIMAL(10, 0),"
                + "bank_payment DECIMAL(10, 0),"
                + "cash_advance DECIMAL(10, 0),"
                + "salary DECIMAL(10, 0),"
                + "maintenance DECIMAL(10, 0),"
                + "miscellaneous DECIMAL(10, 0),"
                + "total_expenses DECIMAL(10, 0),"
                + "reimbursed DECIMAL(10, 0),"
                + "change DECIMAL(10, 0)"
                + ");";
        executeUpdate(createTableSQL);
    }

    public void AddRecord(LocalDate date, String personnelName, float pettyCash, float diesel, float meal, float parking, float bankPayment, float cashAdvance, float salary, float maintenance, float reimbursed, float miscellaneous) {
        float totalExpenses = diesel + meal + parking + bankPayment + cashAdvance + salary + maintenance + miscellaneous;
        float change = (pettyCash - totalExpenses) + reimbursed;
        
        if(change < 0) change += reimbursed;
        if(change > 0) change -= reimbursed;

        String insertSQL = "INSERT INTO ACBAExpenses_Table"
                + "(date, personnel_name, petty_cash, diesel, meal, parking, bank_payment, cash_advance, salary, maintenance, miscellaneous, total_expenses, reimbursed, change) "
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.GetDatabaseConnection();
             PreparedStatement pstm = conn.prepareStatement(insertSQL)) {
            Date sqlDate = Date.valueOf(date);
            pstm.setDate(1, sqlDate);
            pstm.setString(2, personnelName);
            pstm.setFloat(3, pettyCash);
            pstm.setFloat(4, diesel);
            pstm.setFloat(5, meal);
            pstm.setFloat(6, parking);
            pstm.setFloat(7, bankPayment);
            pstm.setFloat(8, cashAdvance);
            pstm.setFloat(9, salary);
            pstm.setFloat(10, maintenance);
            pstm.setFloat(11, miscellaneous);
            pstm.setFloat(12, totalExpenses);
            pstm.setFloat(13, reimbursed);
            pstm.setFloat(14, change);

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void EditRecord(int recordID, LocalDate date, String personnelName, float pettyCash, float diesel, float meal, float parking, float bankPayment, float cashAdvance, float salary, float maintenance, float reimbursed, float miscellaneous) {
        float totalExpenses = diesel + meal + parking + bankPayment + cashAdvance + salary + maintenance + miscellaneous;
        float change = (pettyCash - totalExpenses) + reimbursed;

        String updateSQL = "UPDATE ACBAExpenses_Table SET "
                + "date = ?, "
                + "personnel_name = ?, "
                + "petty_cash = ?, "
                + "diesel = ?, "
                + "meal = ?, "
                + "parking = ?, "
                + "bank_payment = ?, "
                + "cash_advance = ?, "
                + "salary = ?, "
                + "maintenance = ?, "
                + "miscellaneous = ?, "
                + "total_expenses = ?, "
                + "reimbursed = ?, "
                + "change = ? "
                + "WHERE record_id = ?";

        try (Connection conn = DatabaseConnection.GetDatabaseConnection();
             PreparedStatement pstm = conn.prepareStatement(updateSQL)) {
            Date sqlDate = Date.valueOf(date);
            pstm.setDate(1, sqlDate);
            pstm.setString(2, personnelName);
            pstm.setFloat(3, pettyCash);
            pstm.setFloat(4, diesel);
            pstm.setFloat(5, meal);
            pstm.setFloat(6, parking);
            pstm.setFloat(7, bankPayment);
            pstm.setFloat(8, cashAdvance);
            pstm.setFloat(9, salary);
            pstm.setFloat(10, maintenance);
            pstm.setFloat(11, miscellaneous);
            pstm.setFloat(12, totalExpenses);
            pstm.setFloat(13, reimbursed);
            pstm.setFloat(14, change);
            pstm.setInt(15, recordID);

            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void DeleteRecord(int recordID) {
        String deleteSQL = "DELETE FROM ACBAExpenses_Table WHERE record_id = ?";
        
        try (Connection conn = DatabaseConnection.GetDatabaseConnection();
             PreparedStatement pstm = conn.prepareStatement(deleteSQL)) {
            pstm.setInt(1, recordID);
            
            pstm.executeUpdate(); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Object[]> GetDataForCurrentMonth() {
        List<Object[]> dataList = new ArrayList<>();

        try {
            // Get the current year and month
            YearMonth currentYearMonth = YearMonth.now();
            int currentYear = currentYearMonth.getYear();
            int currentMonth = currentYearMonth.getMonthValue();
            
            conn = DatabaseConnection.GetDatabaseConnection();
            pstm = conn.prepareStatement("SELECT * FROM ACBAExpenses_Table");

            rs = pstm.executeQuery();

            while (rs.next()) {
                LocalDate date = rs.getDate("date").toLocalDate();

                // Check if the entry is from the current month
                if (date.getYear() == currentYear && date.getMonthValue() == currentMonth) {
                    int recordID = rs.getInt("record_id");
                    String personnelName = rs.getString("personnel_name");
                    double pettyCash = rs.getDouble("petty_cash");
                    double diesel = rs.getDouble("diesel");
                    double meal = rs.getDouble("meal");
                    double parking = rs.getDouble("parking");
                    double bankPayment = rs.getDouble("bank_payment");
                    double cashAdvance = rs.getDouble("cash_advance");
                    double salary = rs.getDouble("salary");
                    double maintenance = rs.getDouble("maintenance");
                    double miscellaneous = rs.getDouble("miscellaneous");
                    double totalExpenses = rs.getDouble("total_expenses");
                    double reimbursed = rs.getDouble("reimbursed");
                    double change = rs.getDouble("change");

                    dataList.add(new Object[]{recordID, date, personnelName, pettyCash, diesel, meal, parking, bankPayment, cashAdvance, salary, maintenance, miscellaneous, totalExpenses, reimbursed, change});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return dataList;
    }
    
    public List<Object[]> GetFilterData(int year, int month) {
        List<Object[]> dataList = new ArrayList<>();

        try {
            int currentYear = year;
            int currentMonth = month;
            
            conn = DatabaseConnection.GetDatabaseConnection();
            pstm = conn.prepareStatement("SELECT * FROM ACBAExpenses_Table");

            rs = pstm.executeQuery();

            while (rs.next()) {
                LocalDate date = rs.getDate("date").toLocalDate();

                // Check if the entry is from the current month
                if (date.getYear() == currentYear && date.getMonthValue() == currentMonth) {
                    int recordID = rs.getInt("record_id");
                    String personnelName = rs.getString("personnel_name");
                    double pettyCash = rs.getDouble("petty_cash");
                    double diesel = rs.getDouble("diesel");
                    double meal = rs.getDouble("meal");
                    double parking = rs.getDouble("parking");
                    double bankPayment = rs.getDouble("bank_payment");
                    double cashAdvance = rs.getDouble("cash_advance");
                    double salary = rs.getDouble("salary");
                    double maintenance = rs.getDouble("maintenance");
                    double miscellaneous = rs.getDouble("miscellaneous");
                    double totalExpenses = rs.getDouble("total_expenses");
                    double reimbursed = rs.getDouble("reimbursed");
                    double change = rs.getDouble("change");

                    dataList.add(new Object[]{recordID, date, personnelName, pettyCash, diesel, meal, parking, bankPayment, cashAdvance, salary, maintenance, miscellaneous, totalExpenses, reimbursed, change});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return dataList;
    }

    private void executeUpdate(String sql) {
        try (Connection conn = DatabaseConnection.GetDatabaseConnection();
             PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
