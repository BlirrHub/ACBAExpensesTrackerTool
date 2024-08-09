package acbatools;

import java.awt.Color;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ACBAExpensesRecord extends javax.swing.JFrame {

    DefaultTableModel model = null;
    Database db = new Database();
    
    LocalDate date;
    String personnelName;
    float pettyCash;
    float diesel;
    float meal;
    float parking;
    float bankPayment;
    float cashAdvance;
    float salary;
    float maintenance;
    float reimbursed;
    float miscellaneous;
    
    int id;
    
    int month;
    int year;
    
    public ACBAExpensesRecord() {
        initComponents();
        model = (DefaultTableModel) PurchasesTable.getModel();
        
        SetIconImage();
        GetDataForCurrentMonth();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserPanel = new javax.swing.JPanel();
        InputPanel = new javax.swing.JPanel();
        PersonnelPanel = new javax.swing.JPanel();
        PersonnelLabel = new javax.swing.JLabel();
        PersonnelNameTextField = new javax.swing.JTextField();
        PettyCashPanel = new javax.swing.JPanel();
        PettyCashLabel = new javax.swing.JLabel();
        PettyCashTextField = new javax.swing.JTextField();
        DieselPanel = new javax.swing.JPanel();
        DieselLabel = new javax.swing.JLabel();
        DieselTextField = new javax.swing.JTextField();
        MealPanel = new javax.swing.JPanel();
        MealLabel = new javax.swing.JLabel();
        MealTextField = new javax.swing.JTextField();
        ParkingPanel = new javax.swing.JPanel();
        ParkingLabel = new javax.swing.JLabel();
        ParkingTextField = new javax.swing.JTextField();
        BankPaymentPanel = new javax.swing.JPanel();
        BankPaymentLabel = new javax.swing.JLabel();
        BankPaymentTextField = new javax.swing.JTextField();
        CashAdvancePanel = new javax.swing.JPanel();
        CashAdvanceLabel = new javax.swing.JLabel();
        CashAdvanceTextField = new javax.swing.JTextField();
        SalaryPanel = new javax.swing.JPanel();
        SalaryLabel = new javax.swing.JLabel();
        SalaryTextField = new javax.swing.JTextField();
        MaitenancePanel = new javax.swing.JPanel();
        MaintenanceLabel = new javax.swing.JLabel();
        MaintenanceTextField = new javax.swing.JTextField();
        Others = new javax.swing.JPanel();
        MiscellaneousLabel = new javax.swing.JLabel();
        MiscellaneousTextField = new javax.swing.JTextField();
        ReimbursedPanel = new javax.swing.JPanel();
        ReimbursedLabel = new javax.swing.JLabel();
        ReimbursedTextField = new javax.swing.JTextField();
        ViewAllRecordButton = new javax.swing.JLabel();
        PersonnelPanel1 = new javax.swing.JPanel();
        DateLabel = new javax.swing.JLabel();
        DatePicker = new com.github.lgooddatepicker.components.DatePicker();
        ButtonPanel = new javax.swing.JPanel();
        ClearButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ExpensesLabel = new javax.swing.JLabel();
        FilterLabel = new javax.swing.JLabel();
        FilterFieldsPanel = new javax.swing.JPanel();
        MonthSelector = new javax.swing.JComboBox<>();
        YearTextField = new javax.swing.JTextField();
        EnterButton = new javax.swing.JButton();
        RecordsTablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PurchasesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACBA Expenses");
        setResizable(false);

        UserPanel.setBackground(new java.awt.Color(204, 204, 204));
        UserPanel.setPreferredSize(new java.awt.Dimension(1366, 318));
        UserPanel.setLayout(new java.awt.BorderLayout());

        InputPanel.setBackground(new java.awt.Color(204, 204, 204));
        InputPanel.setPreferredSize(new java.awt.Dimension(1200, 86));

        PersonnelPanel.setBackground(new java.awt.Color(204, 204, 204));

        PersonnelLabel.setText("Personnel");
        PersonnelLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        PersonnelNameTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout PersonnelPanelLayout = new javax.swing.GroupLayout(PersonnelPanel);
        PersonnelPanel.setLayout(PersonnelPanelLayout);
        PersonnelPanelLayout.setHorizontalGroup(
            PersonnelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonnelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonnelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PersonnelNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(PersonnelLabel))
                .addContainerGap())
        );
        PersonnelPanelLayout.setVerticalGroup(
            PersonnelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonnelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PersonnelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PersonnelNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PettyCashPanel.setBackground(new java.awt.Color(204, 204, 204));

        PettyCashLabel.setText("Petty Cash");
        PettyCashLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        PettyCashTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout PettyCashPanelLayout = new javax.swing.GroupLayout(PettyCashPanel);
        PettyCashPanel.setLayout(PettyCashPanelLayout);
        PettyCashPanelLayout.setHorizontalGroup(
            PettyCashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PettyCashPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PettyCashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PettyCashTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(PettyCashLabel))
                .addContainerGap())
        );
        PettyCashPanelLayout.setVerticalGroup(
            PettyCashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PettyCashPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PettyCashLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PettyCashTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        DieselPanel.setBackground(new java.awt.Color(204, 204, 204));

        DieselLabel.setText("Diesel");
        DieselLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        DieselTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout DieselPanelLayout = new javax.swing.GroupLayout(DieselPanel);
        DieselPanel.setLayout(DieselPanelLayout);
        DieselPanelLayout.setHorizontalGroup(
            DieselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DieselPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DieselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DieselTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(DieselLabel))
                .addContainerGap())
        );
        DieselPanelLayout.setVerticalGroup(
            DieselPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DieselPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DieselLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DieselTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MealPanel.setBackground(new java.awt.Color(204, 204, 204));

        MealLabel.setText("Meal");
        MealLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        MealTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout MealPanelLayout = new javax.swing.GroupLayout(MealPanel);
        MealPanel.setLayout(MealPanelLayout);
        MealPanelLayout.setHorizontalGroup(
            MealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MealPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MealTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(MealLabel))
                .addContainerGap())
        );
        MealPanelLayout.setVerticalGroup(
            MealPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MealPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MealLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MealTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ParkingPanel.setBackground(new java.awt.Color(204, 204, 204));

        ParkingLabel.setText("Parking");
        ParkingLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        ParkingTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout ParkingPanelLayout = new javax.swing.GroupLayout(ParkingPanel);
        ParkingPanel.setLayout(ParkingPanelLayout);
        ParkingPanelLayout.setHorizontalGroup(
            ParkingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ParkingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParkingTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(ParkingLabel))
                .addContainerGap())
        );
        ParkingPanelLayout.setVerticalGroup(
            ParkingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ParkingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ParkingLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ParkingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        BankPaymentPanel.setBackground(new java.awt.Color(204, 204, 204));
        BankPaymentPanel.setPreferredSize(new java.awt.Dimension(170, 83));

        BankPaymentLabel.setText("Bank Payment");
        BankPaymentLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        BankPaymentTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout BankPaymentPanelLayout = new javax.swing.GroupLayout(BankPaymentPanel);
        BankPaymentPanel.setLayout(BankPaymentPanelLayout);
        BankPaymentPanelLayout.setHorizontalGroup(
            BankPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BankPaymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BankPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BankPaymentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(BankPaymentLabel))
                .addContainerGap())
        );
        BankPaymentPanelLayout.setVerticalGroup(
            BankPaymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BankPaymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BankPaymentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BankPaymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CashAdvancePanel.setBackground(new java.awt.Color(204, 204, 204));
        CashAdvancePanel.setPreferredSize(new java.awt.Dimension(213, 83));

        CashAdvanceLabel.setText("Cash Advance");
        CashAdvanceLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        CashAdvanceTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout CashAdvancePanelLayout = new javax.swing.GroupLayout(CashAdvancePanel);
        CashAdvancePanel.setLayout(CashAdvancePanelLayout);
        CashAdvancePanelLayout.setHorizontalGroup(
            CashAdvancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashAdvancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CashAdvancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CashAdvanceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(CashAdvanceLabel))
                .addContainerGap())
        );
        CashAdvancePanelLayout.setVerticalGroup(
            CashAdvancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashAdvancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CashAdvanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CashAdvanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SalaryPanel.setBackground(new java.awt.Color(204, 204, 204));
        SalaryPanel.setPreferredSize(new java.awt.Dimension(213, 83));

        SalaryLabel.setText("Salary");
        SalaryLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        SalaryTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout SalaryPanelLayout = new javax.swing.GroupLayout(SalaryPanel);
        SalaryPanel.setLayout(SalaryPanelLayout);
        SalaryPanelLayout.setHorizontalGroup(
            SalaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SalaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SalaryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(SalaryLabel))
                .addContainerGap())
        );
        SalaryPanelLayout.setVerticalGroup(
            SalaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SalaryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MaitenancePanel.setBackground(new java.awt.Color(204, 204, 204));
        MaitenancePanel.setPreferredSize(new java.awt.Dimension(213, 83));

        MaintenanceLabel.setText("Maitenance");
        MaintenanceLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        MaintenanceTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout MaitenancePanelLayout = new javax.swing.GroupLayout(MaitenancePanel);
        MaitenancePanel.setLayout(MaitenancePanelLayout);
        MaitenancePanelLayout.setHorizontalGroup(
            MaitenancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MaitenancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MaitenancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MaintenanceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(MaintenanceLabel))
                .addContainerGap())
        );
        MaitenancePanelLayout.setVerticalGroup(
            MaitenancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MaitenancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MaintenanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MaintenanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Others.setBackground(new java.awt.Color(204, 204, 204));
        Others.setPreferredSize(new java.awt.Dimension(216, 83));

        MiscellaneousLabel.setText("Miscellaneous");
        MiscellaneousLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        MiscellaneousTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout OthersLayout = new javax.swing.GroupLayout(Others);
        Others.setLayout(OthersLayout);
        OthersLayout.setHorizontalGroup(
            OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OthersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MiscellaneousTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(MiscellaneousLabel))
                .addContainerGap())
        );
        OthersLayout.setVerticalGroup(
            OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OthersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MiscellaneousLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MiscellaneousTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ReimbursedPanel.setBackground(new java.awt.Color(204, 204, 204));
        ReimbursedPanel.setPreferredSize(new java.awt.Dimension(213, 83));

        ReimbursedLabel.setText("Reimbursed");
        ReimbursedLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        ReimbursedTextField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N

        javax.swing.GroupLayout ReimbursedPanelLayout = new javax.swing.GroupLayout(ReimbursedPanel);
        ReimbursedPanel.setLayout(ReimbursedPanelLayout);
        ReimbursedPanelLayout.setHorizontalGroup(
            ReimbursedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReimbursedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReimbursedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ReimbursedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(ReimbursedLabel))
                .addContainerGap())
        );
        ReimbursedPanelLayout.setVerticalGroup(
            ReimbursedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReimbursedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ReimbursedLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReimbursedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ViewAllRecordButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        ViewAllRecordButton.setText("< GO BACK");
        ViewAllRecordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewAllRecordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewAllRecordButtonMouseClicked(evt);
            }
        });

        PersonnelPanel1.setBackground(new java.awt.Color(204, 204, 204));

        DateLabel.setText("Date");
        DateLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N

        javax.swing.GroupLayout PersonnelPanel1Layout = new javax.swing.GroupLayout(PersonnelPanel1);
        PersonnelPanel1.setLayout(PersonnelPanel1Layout);
        PersonnelPanel1Layout.setHorizontalGroup(
            PersonnelPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonnelPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PersonnelPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PersonnelPanel1Layout.createSequentialGroup()
                        .addComponent(DateLabel)
                        .addGap(0, 122, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PersonnelPanel1Layout.setVerticalGroup(
            PersonnelPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonnelPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(InputPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(BankPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CashAdvancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SalaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MaitenancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ReimbursedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Others, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InputPanelLayout.createSequentialGroup()
                                .addComponent(PersonnelPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PersonnelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PettyCashPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DieselPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(MealPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ParkingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ViewAllRecordButton)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(ViewAllRecordButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ParkingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MealPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DieselPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PettyCashPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonnelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonnelPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SalaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaitenancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CashAdvancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Others, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReimbursedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BankPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        UserPanel.add(InputPanel, java.awt.BorderLayout.WEST);

        ButtonPanel.setBackground(new java.awt.Color(204, 204, 204));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(166, 226));

        ClearButton.setText("CLEAR");
        ClearButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        ClearButton.setPreferredSize(new java.awt.Dimension(150, 50));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("DELETE");
        DeleteButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        DeleteButton.setPreferredSize(new java.awt.Dimension(150, 50));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        AddButton.setText("ADD");
        AddButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        AddButton.setPreferredSize(new java.awt.Dimension(150, 50));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        EditButton.setText("EDIT");
        EditButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        EditButton.setPreferredSize(new java.awt.Dimension(150, 50));
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EditButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        UserPanel.add(ButtonPanel, java.awt.BorderLayout.EAST);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(1366, 75));

        ExpensesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExpensesLabel.setText("EXPENSES");
        ExpensesLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N

        FilterLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        FilterLabel.setText("Filter Expenses");

        FilterFieldsPanel.setBackground(new java.awt.Color(204, 204, 204));

        MonthSelector.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        MonthSelector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT MONTH", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        MonthSelector.setMinimumSize(new java.awt.Dimension(140, 30));
        MonthSelector.setPreferredSize(new java.awt.Dimension(150, 30));
        FilterFieldsPanel.add(MonthSelector);

        YearTextField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        YearTextField.setForeground(new java.awt.Color(153, 153, 153));
        YearTextField.setText("ENTER YEAR");
        YearTextField.setPreferredSize(new java.awt.Dimension(100, 30));
        YearTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                YearTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                YearTextFieldFocusLost(evt);
            }
        });
        FilterFieldsPanel.add(YearTextField);

        EnterButton.setText("ENTER");
        EnterButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        EnterButton.setPreferredSize(new java.awt.Dimension(80, 30));
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });
        FilterFieldsPanel.add(EnterButton);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(FilterLabel))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(FilterFieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232)
                        .addComponent(ExpensesLabel)))
                .addGap(356, 651, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(FilterLabel)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExpensesLabel)
                    .addComponent(FilterFieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        UserPanel.add(jPanel4, java.awt.BorderLayout.SOUTH);

        getContentPane().add(UserPanel, java.awt.BorderLayout.NORTH);

        RecordsTablePanel.setBackground(new java.awt.Color(255, 255, 255));
        RecordsTablePanel.setPreferredSize(new java.awt.Dimension(1366, 450));
        RecordsTablePanel.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        PurchasesTable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        PurchasesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Personnel", "Petty Cash", "Diesel", "Meal", "Parking", "Bank Payment", "Cash Advance", "Salary", "Maintenance", "Miscellaneous", "Total Expenses", "Reimbursed", "CHANGE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PurchasesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PurchasesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PurchasesTable);
        if (PurchasesTable.getColumnModel().getColumnCount() > 0) {
            PurchasesTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            PurchasesTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        RecordsTablePanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(RecordsTablePanel, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ViewAllRecordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAllRecordButtonMouseClicked
        new ACBAExpenses().setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewAllRecordButtonMouseClicked

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        ClearInputFields();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        db.DeleteRecord(id);
        ProcessData();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        try{
            ProcessAddData();
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers in the fields.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "One or more input fields are not initialized.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage());
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        try{
            ProcessEditData();
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers in the fields.");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "One or more input fields are not initialized.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage());
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed
        GetFilterData();
    }//GEN-LAST:event_EnterButtonActionPerformed

    private void PurchasesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PurchasesTableMouseClicked
        int i = PurchasesTable.getSelectedRow();
        
        String dateString = model.getValueAt(i, 1).toString();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        try{
            LocalDate date = LocalDate.parse(dateString, dateFormatter);
            DatePicker.setDate(date);
        }catch(DateTimeParseException e){}
                
        id = Integer.parseInt(model.getValueAt(i, 0).toString());
        PersonnelNameTextField.setText(model.getValueAt(i, 2).toString());
        PettyCashTextField.setText(model.getValueAt(i, 3).toString());
        DieselTextField.setText(model.getValueAt(i, 4).toString());
        MealTextField.setText(model.getValueAt(i, 5).toString());
        ParkingTextField.setText(model.getValueAt(i, 6).toString());
        BankPaymentTextField.setText(model.getValueAt(i, 7).toString());
        CashAdvanceTextField.setText(model.getValueAt(i, 8).toString());
        SalaryTextField.setText(model.getValueAt(i, 8).toString());
        MaintenanceTextField.setText(model.getValueAt(i, 10).toString());
        ReimbursedTextField.setText(model.getValueAt(i, 13).toString());
        MiscellaneousTextField.setText(model.getValueAt(i, 11).toString());
    }//GEN-LAST:event_PurchasesTableMouseClicked

    private void YearTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_YearTextFieldFocusGained
        if(YearTextField.getText().equals("ENTER YEAR"))
        {
            YearTextField.setText("");
            YearTextField.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_YearTextFieldFocusGained

    private void YearTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_YearTextFieldFocusLost
        if(YearTextField.getText().equals(""))
        {
            YearTextField.setText("ENTER YEAR");
            YearTextField.setForeground(new Color(153, 153, 153));
            YearTextField.setSize(100, 30);
        }
    }//GEN-LAST:event_YearTextFieldFocusLost

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ACBAExpensesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACBAExpensesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACBAExpensesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACBAExpensesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACBAExpensesRecord().setVisible(true);
            }
        });
    }
    
    private void ProcessAddData()
    {
            GetUserInput();
            db.AddRecord(date, personnelName, pettyCash, diesel, meal, parking, bankPayment, cashAdvance, salary, maintenance, reimbursed, miscellaneous);
            ProcessData();
    }
    
    private void ProcessEditData()
    {        
            GetUserInput();
            db.EditRecord(id, date, personnelName, pettyCash, diesel, meal, parking, bankPayment, cashAdvance, salary, maintenance, reimbursed, miscellaneous); 
            ProcessData();
    }
    
    private void ProcessData()
    {
            model.setRowCount(0);
            if(year != 0 && month != 0){
                GetFilterData();
            } 
            ClearInputFields();
    }
    
    private void GetUserInput()
    {
            date = DatePicker.getDate() == null ? LocalDate.now() :  DatePicker.getDate();
            personnelName = PersonnelNameTextField.getText().toUpperCase();
            pettyCash = Float.parseFloat(PettyCashTextField.getText());
            diesel = DieselTextField.getText().isEmpty() ? 0 : Float.parseFloat(DieselTextField.getText());
            meal = MealTextField.getText().isEmpty() ? 0 : Float.parseFloat(MealTextField.getText());
            parking = ParkingTextField.getText().isEmpty() ? 0 : Float.parseFloat(ParkingTextField.getText());
            bankPayment = BankPaymentTextField.getText().isEmpty() ? 0 : Float.parseFloat(BankPaymentTextField.getText());
            cashAdvance = CashAdvanceTextField.getText().isEmpty() ? 0 : Float.parseFloat(CashAdvanceTextField.getText());
            salary = SalaryTextField.getText().isEmpty() ? 0 : Float.parseFloat(SalaryTextField.getText());
            maintenance = MaintenanceTextField.getText().isEmpty() ? 0 : Float.parseFloat(MaintenanceTextField.getText());
            reimbursed = ReimbursedTextField.getText().isEmpty() ? 0 : Float.parseFloat(ReimbursedTextField.getText());
            miscellaneous = MiscellaneousTextField.getText().isEmpty() ? 0 : Float.parseFloat(MiscellaneousTextField.getText());
    }
    
    private void SetIconImage()
    {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ACBA_Logo.png")));
    }
        
     private void ClearInputFields(){
        PersonnelNameTextField.setText("");
        PettyCashTextField.setText("");
        DieselTextField.setText("");
        MealTextField.setText("");
        ParkingTextField.setText("");
        BankPaymentTextField.setText("");
        CashAdvanceTextField.setText("");
        SalaryTextField.setText("");
        MaintenanceTextField.setText("");
        ReimbursedTextField.setText("");
        MiscellaneousTextField.setText("");
    }
     
     private void GetFilterData(){
        String yearString = YearTextField.getText();

        if(MonthSelector.getSelectedIndex() != 0){
            month = MonthSelector.getSelectedIndex();
        }else{
            JOptionPane.showMessageDialog(this, "Select a month.");
        }

        try{
            int yearInt = Integer.parseInt(yearString);
            year = yearInt;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Please enter a valid year.");
        }

        DefaultTableModel model = (DefaultTableModel) PurchasesTable.getModel();
        List<Object[]> dataList  = db.GetFilterData(year, month);

        model.setRowCount(0);

        for (Object[] row : dataList)
        {
            model.addRow(row);
        }
    }
     
    private void GetDataForCurrentMonth(){
           DefaultTableModel model = (DefaultTableModel) PurchasesTable.getModel();
           List<Object[]> dataList  = db.GetDataForCurrentMonth();

           model.setRowCount(0);

           for (Object[] row : dataList)
           {
               model.addRow(row);
           }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JLabel BankPaymentLabel;
    private javax.swing.JPanel BankPaymentPanel;
    private javax.swing.JTextField BankPaymentTextField;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JLabel CashAdvanceLabel;
    private javax.swing.JPanel CashAdvancePanel;
    private javax.swing.JTextField CashAdvanceTextField;
    private javax.swing.JButton ClearButton;
    private javax.swing.JLabel DateLabel;
    private com.github.lgooddatepicker.components.DatePicker DatePicker;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel DieselLabel;
    private javax.swing.JPanel DieselPanel;
    private javax.swing.JTextField DieselTextField;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton EnterButton;
    private javax.swing.JLabel ExpensesLabel;
    private javax.swing.JPanel FilterFieldsPanel;
    private javax.swing.JLabel FilterLabel;
    private javax.swing.JPanel InputPanel;
    private javax.swing.JLabel MaintenanceLabel;
    private javax.swing.JTextField MaintenanceTextField;
    private javax.swing.JPanel MaitenancePanel;
    private javax.swing.JLabel MealLabel;
    private javax.swing.JPanel MealPanel;
    private javax.swing.JTextField MealTextField;
    private javax.swing.JLabel MiscellaneousLabel;
    private javax.swing.JTextField MiscellaneousTextField;
    private javax.swing.JComboBox<String> MonthSelector;
    private javax.swing.JPanel Others;
    private javax.swing.JLabel ParkingLabel;
    private javax.swing.JPanel ParkingPanel;
    private javax.swing.JTextField ParkingTextField;
    private javax.swing.JLabel PersonnelLabel;
    private javax.swing.JTextField PersonnelNameTextField;
    private javax.swing.JPanel PersonnelPanel;
    private javax.swing.JPanel PersonnelPanel1;
    private javax.swing.JLabel PettyCashLabel;
    private javax.swing.JPanel PettyCashPanel;
    private javax.swing.JTextField PettyCashTextField;
    private javax.swing.JTable PurchasesTable;
    private javax.swing.JPanel RecordsTablePanel;
    private javax.swing.JLabel ReimbursedLabel;
    private javax.swing.JPanel ReimbursedPanel;
    private javax.swing.JTextField ReimbursedTextField;
    private javax.swing.JLabel SalaryLabel;
    private javax.swing.JPanel SalaryPanel;
    private javax.swing.JTextField SalaryTextField;
    private javax.swing.JPanel UserPanel;
    private javax.swing.JLabel ViewAllRecordButton;
    private javax.swing.JTextField YearTextField;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
