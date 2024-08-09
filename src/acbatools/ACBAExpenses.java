package acbatools;

import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ACBAExpenses extends javax.swing.JFrame {
    
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
    
    public ACBAExpenses() {
        initComponents();
        model = (DefaultTableModel) PurchasesTable.getModel();
        
        db.CreateTable();
        
        SetIconImage();
        SetMonthExpensesText();
        GetDataForCurrentMonth();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EditorPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
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
        ButtonPanel = new javax.swing.JPanel();
        ClearButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        ExpensesLabel = new javax.swing.JLabel();
        TablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PurchasesTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACBA Expenses");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("MainFrame"); // NOI18N
        setResizable(false);

        EditorPanel.setLayout(new java.awt.BorderLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(1366, 226));
        jPanel3.setLayout(new java.awt.BorderLayout());

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
                    .addComponent(PersonnelNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
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
                    .addComponent(PettyCashTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
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
                    .addComponent(DieselTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
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
                    .addComponent(MealTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
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
                    .addComponent(ParkingTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
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
                    .addComponent(BankPaymentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
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
                    .addComponent(CashAdvanceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
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
                    .addComponent(SalaryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
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
                    .addComponent(MaintenanceTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
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
                    .addComponent(MiscellaneousTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
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
                    .addComponent(ReimbursedTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
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
        ViewAllRecordButton.setText("VIEW ALL RECORDS >");
        ViewAllRecordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewAllRecordButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewAllRecordButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout InputPanelLayout = new javax.swing.GroupLayout(InputPanel);
        InputPanel.setLayout(InputPanelLayout);
        InputPanelLayout.setHorizontalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addComponent(PersonnelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(PettyCashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(DieselPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(MealPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ParkingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(InputPanelLayout.createSequentialGroup()
                        .addComponent(CashAdvancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(SalaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(MaitenancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ReimbursedPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Others, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(BankPaymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ViewAllRecordButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InputPanelLayout.setVerticalGroup(
            InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BankPaymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ParkingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MealPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DieselPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PettyCashPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonnelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(InputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SalaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaitenancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CashAdvancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Others, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReimbursedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(ViewAllRecordButton))
        );

        jPanel3.add(InputPanel, java.awt.BorderLayout.WEST);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(ButtonPanel, java.awt.BorderLayout.EAST);

        EditorPanel.add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(1366, 42));

        ExpensesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExpensesLabel.setText("EXPENSES");
        ExpensesLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 24)); // NOI18N
        jPanel4.add(ExpensesLabel);

        EditorPanel.add(jPanel4, java.awt.BorderLayout.SOUTH);

        getContentPane().add(EditorPanel, java.awt.BorderLayout.CENTER);

        TablePanel.setBackground(new java.awt.Color(255, 255, 255));
        TablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablePanel.setPreferredSize(new java.awt.Dimension(1366, 500));
        TablePanel.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

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
        PurchasesTable.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        PurchasesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PurchasesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PurchasesTable);
        if (PurchasesTable.getColumnModel().getColumnCount() > 0) {
            PurchasesTable.getColumnModel().getColumn(0).setResizable(false);
            PurchasesTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            PurchasesTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            PurchasesTable.getColumnModel().getColumn(2).setResizable(false);
        }

        TablePanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(TablePanel, java.awt.BorderLayout.SOUTH);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        db.DeleteRecord(id);
        ProcessData();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        ClearInputFields();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void ViewAllRecordButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewAllRecordButtonMouseClicked
        new ACBAExpensesRecord().setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewAllRecordButtonMouseClicked

    private void PurchasesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PurchasesTableMouseClicked
        int i = PurchasesTable.getSelectedRow();
        
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
            java.util.logging.Logger.getLogger(ACBAExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACBAExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACBAExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACBAExpenses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACBAExpenses().setVisible(true);
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
            GetDataForCurrentMonth();            
            ClearInputFields();
    }
    
    private void GetUserInput()
    {
            date = LocalDate.now();
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
    
    private void SetMonthExpensesText()
    {
        YearMonth currentYearMonth = YearMonth.now();
        DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MMMM");
        String currentMonth = currentYearMonth.format(monthFormatter).toUpperCase();
        
        ExpensesLabel.setText(currentMonth + " EXPENSES");
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
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel DieselLabel;
    private javax.swing.JPanel DieselPanel;
    private javax.swing.JTextField DieselTextField;
    private javax.swing.JButton EditButton;
    private javax.swing.JPanel EditorPanel;
    private javax.swing.JLabel ExpensesLabel;
    private javax.swing.JPanel InputPanel;
    private javax.swing.JLabel MaintenanceLabel;
    private javax.swing.JTextField MaintenanceTextField;
    private javax.swing.JPanel MaitenancePanel;
    private javax.swing.JLabel MealLabel;
    private javax.swing.JPanel MealPanel;
    private javax.swing.JTextField MealTextField;
    private javax.swing.JLabel MiscellaneousLabel;
    private javax.swing.JTextField MiscellaneousTextField;
    private javax.swing.JPanel Others;
    private javax.swing.JLabel ParkingLabel;
    private javax.swing.JPanel ParkingPanel;
    private javax.swing.JTextField ParkingTextField;
    private javax.swing.JLabel PersonnelLabel;
    private javax.swing.JTextField PersonnelNameTextField;
    private javax.swing.JPanel PersonnelPanel;
    private javax.swing.JLabel PettyCashLabel;
    private javax.swing.JPanel PettyCashPanel;
    private javax.swing.JTextField PettyCashTextField;
    private javax.swing.JTable PurchasesTable;
    private javax.swing.JLabel ReimbursedLabel;
    private javax.swing.JPanel ReimbursedPanel;
    private javax.swing.JTextField ReimbursedTextField;
    private javax.swing.JLabel SalaryLabel;
    private javax.swing.JPanel SalaryPanel;
    private javax.swing.JTextField SalaryTextField;
    private javax.swing.JPanel TablePanel;
    private javax.swing.JLabel ViewAllRecordButton;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
