/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package View;

import Service.Implement.ThongKeServiceImpl;
import Service.ThongKeService;
import ViewModels.BaoCaoMail;
import ViewModels.ChartThongKe;
import ViewModels.SPBanChayViewModel;
import ViewModels.TheLoaiBanChay;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author acer
 */
public class FormThongKe_DoanhThu extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormThongKe_DoanhThu
     */
    private ThongKeService service = new ThongKeServiceImpl();
    DefaultTableModel model;
    public FormThongKe_DoanhThu() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        setDataChart(panelTK1);
        loadTableSP();
        loadTableTL();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTK1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSPBanChay = new javax.swing.JTable();
        btnXuatFile = new javax.swing.JButton();
        btnBaoCao = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTheLoaiBanChay = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1010, 640));

        javax.swing.GroupLayout panelTK1Layout = new javax.swing.GroupLayout(panelTK1);
        panelTK1.setLayout(panelTK1Layout);
        panelTK1Layout.setHorizontalGroup(
            panelTK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelTK1Layout.setVerticalGroup(
            panelTK1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        tblSPBanChay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thang", "The loai", "So luong sach", "Tong tien"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSPBanChay);
        if (tblSPBanChay.getColumnModel().getColumnCount() > 0) {
            tblSPBanChay.getColumnModel().getColumn(0).setResizable(false);
            tblSPBanChay.getColumnModel().getColumn(1).setResizable(false);
            tblSPBanChay.getColumnModel().getColumn(2).setResizable(false);
        }

        btnXuatFile.setText("Xuat file");
        btnXuatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatFileActionPerformed(evt);
            }
        });

        btnBaoCao.setText("Bao cao");
        btnBaoCao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaoCaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXuatFile)
                .addGap(18, 18, 18)
                .addComponent(btnBaoCao)
                .addGap(353, 353, 353))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXuatFile)
                    .addComponent(btnBaoCao))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("San pham ban chay", jPanel1);

        tblTheLoaiBanChay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Thang", "Ten Sach", "So luong", "Tong tien"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblTheLoaiBanChay);
        if (tblTheLoaiBanChay.getColumnModel().getColumnCount() > 0) {
            tblTheLoaiBanChay.getColumnModel().getColumn(0).setResizable(false);
            tblTheLoaiBanChay.getColumnModel().getColumn(1).setResizable(false);
            tblTheLoaiBanChay.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("The loai ban chay", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTK1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTK1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXuatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatFileActionPerformed
        List<BaoCaoMail> list = service.BaoCao();
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("danhSach");
        XSSFRow row = null;
        Cell cell = null;
        Font font = workbook.createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short)17);
        font.setColor(IndexedColors.RED.getIndex());
        
        CellStyle headCellStyle = workbook.createCellStyle();
        headCellStyle.setFont(font);

        row = sheet.createRow(3);
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("Thoi gian");
        
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("Tên Sách");
        
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("So luong");
        
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Tong tien");

        for(int i = 0;  i < list.size(); i++ ){
            row = sheet.createRow(4+i);
            
            cell= row.createCell(0, CellType.STRING);
            cell.setCellValue(list.get(i).getNgay());
            
            cell= row.createCell(1, CellType.STRING);
            cell.setCellValue(list.get(i).getTen());
            
            cell= row.createCell(2, CellType.STRING);
            cell.setCellValue(list.get(i).getSoLuong());
            
            cell= row.createCell(3, CellType.STRING);
            cell.setCellValue(list.get(i).getTongTien());
    }
        File file = new File("D://Nhom1//ThongKe3.xlsx");
        try {
            FileOutputStream fis =  new FileOutputStream(file);
            workbook.write(fis);
            fis.close();
            JOptionPane.showMessageDialog(this, "Xuat file excel thành công");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXuatFileActionPerformed

    private void btnBaoCaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaoCaoActionPerformed
        GuiMail mail = new GuiMail();
        mail.setVisible(true);
    }//GEN-LAST:event_btnBaoCaoActionPerformed
    private void setDataChart(JPanel panel) {
        List<ChartThongKe> list = service.chartThongKe();
        if(list != null) {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            for (ChartThongKe item : list) {
                dataset.setValue(item.getDoanhThu(), "Doanh thu", item.getThang());
            }
            JFreeChart chart = ChartFactory.createBarChart("Thong ke doanh thu", "Thoi gian", "Doanh thu", dataset);
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(new Dimension(panel.getWidth(), 300));
            
            panel.removeAll();
            panel.setLayout(new CardLayout());
            panel.add(chartPanel);
            panel.validate();
            panel.repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaoCao;
    private javax.swing.JButton btnXuatFile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelTK1;
    private javax.swing.JTable tblSPBanChay;
    private javax.swing.JTable tblTheLoaiBanChay;
    // End of variables declaration//GEN-END:variables

    private void loadTableSP() {
        model = (DefaultTableModel) tblSPBanChay.getModel();
        List<SPBanChayViewModel> list = service.tblSPBanChay();
        for (SPBanChayViewModel sp : list) {
            model.addRow(new Object[] {sp.getThang(), sp.getTenSach(),sp.getSoLuong(), sp.getTongTien()});
        }
    }
    private void loadTableTL() {
        model = (DefaultTableModel) tblTheLoaiBanChay.getModel();
        List<TheLoaiBanChay> list = service.tblSPTheLoai();
        for (TheLoaiBanChay tl : list) {
            model.addRow(new Object[] {tl.getThang(), tl.getTenTheLoai(),tl.getSoLuong(), tl.getTongTien()});
        }
    }
}