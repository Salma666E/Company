/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author باسم
 */
public class Company_Frame extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Company_Frame
     */
    
    
      ArrayList <emp_company> employees = new ArrayList();
    
   
    int num =0;
    
    public Company_Frame() {
        initComponents();
        txtarea.setEditable(false);
        payment_txtarea.setEditable(false);
        btnsave.addActionListener(this);
        btnedit.addActionListener(this);
        btnshow.addActionListener(this);
        btnsearch.addActionListener(this);
        setPayment();
        
        
    }

     static int sum=0;
    static int count=0;
    static int average=0;

    private void setPayment() {
        
      //sum=(Integer.parseInt(tfovertime.getText())*300)+(Integer.parseInt(tfhoursworked.getText())*200);
        
        

        if(count!=0)
         payment_txtarea.setText("Payment of the Employee "+count+" is = "
                 +sum+"\nAverage of Payments of all Employees = "+average/count);
//            average=sum/count;
       // payment_txtarea.setText("Average of Payment of all Employees is ="+sum/count);
        
        else
            payment_txtarea.setText("");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lid = new javax.swing.JLabel();
        ladd = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        lrank = new javax.swing.JLabel();
        lhoursworked = new javax.swing.JLabel();
        lovertime = new javax.swing.JLabel();
        tfname = new javax.swing.JTextField();
        tfid = new javax.swing.JTextField();
        tfaddress = new javax.swing.JTextField();
        tfrank = new javax.swing.JTextField();
        tfhoursworked = new javax.swing.JTextField();
        tfovertime = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        btnsave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        btnshow = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        payment_txtarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lid.setText("ID");

        ladd.setText("Address");

        lname.setText("Name");

        lrank.setText("Rank");

        lhoursworked.setText("Hours_Worked");

        lovertime.setText("Overtime_Hours");

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        btnsave.setText("Save Data");

        btnedit.setText("Edit Data");

        btnsearch.setText("Search ID");

        btnshow.setText("Show Data ");

        payment_txtarea.setColumns(20);
        payment_txtarea.setRows(5);
        jScrollPane2.setViewportView(payment_txtarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ladd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                        .addComponent(lid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lrank, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lhoursworked, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnsearch)
                                .addComponent(lovertime)
                                .addComponent(btnsave)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfname)
                                .addComponent(tfid)
                                .addComponent(tfaddress, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(tfhoursworked, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(tfrank)
                                .addComponent(tfovertime, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnshow)
                                    .addComponent(btnedit))
                                .addGap(10, 10, 10))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lname)
                                    .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lid)
                                    .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ladd))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfrank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lrank))
                                .addGap(18, 18, 18)
                                .addComponent(lhoursworked)
                                .addGap(6, 6, 6))
                            .addComponent(tfhoursworked, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfovertime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lovertime))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsave)
                            .addComponent(btnshow))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsearch)
                            .addComponent(btnedit))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Company_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Company_Frame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnshow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel ladd;
    private javax.swing.JLabel lhoursworked;
    private javax.swing.JLabel lid;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel lovertime;
    private javax.swing.JLabel lrank;
    private javax.swing.JTextArea payment_txtarea;
    private javax.swing.JTextField tfaddress;
    private javax.swing.JTextField tfhoursworked;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfovertime;
    private javax.swing.JTextField tfrank;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables


    
     public void save()
    { 
        String name= tfname.getText();
        String address=tfaddress.getText();
        int id = Integer.parseInt(tfid.getText());
        int rank = Integer.parseInt(tfrank.getText());
        int overtime = Integer.parseInt(tfovertime.getText());
        int hourworks =  Integer.parseInt(tfhoursworked.getText());
        
        //constant salary of Hours_worked=200 and for Overtime_Hours = 300 .
        count++;
        sum=(Integer.parseInt(tfovertime.getText())*300)+(Integer.parseInt(tfhoursworked.getText())*200);
        average+=sum;
       //store the data.
        emp_company temp = new emp_company(id, name, address, rank , hourworks, overtime);
        employees.add(temp);
        //make TextFields to be empty after click save_Button.
            tfname.setText("");
            tfid.setText("");
            tfaddress.setText("");
            tfhoursworked.setText("");
            tfrank.setText("");
            tfovertime.setText("");
            
            setPayment();
            //setAverage();
            
    }
    
    
        public void edit()
    {
        String id= tfid.getText();
        for(int i=0 ;i<employees.size();i++)
             if(id.equals(employees.get(i).getId()+""))
             {
                String name= tfname.getText();
                int Id = Integer.parseInt(tfid.getText());
                String address=tfaddress.getText();
                int rank = Integer.parseInt(tfrank.getText());
                int overtime = Integer.parseInt(tfovertime.getText());
                int hourworks =  Integer.parseInt(tfhoursworked.getText());
                //deleted past salary
              sum-=employees.get(i).getHoursworked()*200+employees.get(i).getOvertime()*300;
              average-=sum;
                employees.remove(i);
                employees.add(new emp_company(Id, name, address, rank , hourworks, overtime));
               sum=(Integer.parseInt(tfovertime.getText())*300)+(Integer.parseInt(tfhoursworked.getText())*200);
               average+=sum;
                break;
             }
        else
                 txtarea.setText("Oops ! There is no Employee has that ID.");
        setPayment();
    }
    
    
        public void search()
    {
        
         String name= tfname.getText();
         txtarea.setText("");
         for(int i=0 ;i<employees.size();i++)
             if(name.equals(employees.get(i).getName()))
             {txtarea.setText("Data of Employee that you Search :\n\n\n"+"Name : "+employees.get(i).getName()+"\n ID    : "
                         +employees.get(i).getId()
                         +"\n Address : "+employees.get(i).getAddress()
                         +"\n rank   : "+employees.get(i).getRank()
                         +"\nHours_Worked    : "+employees.get(i).getHoursworked()+"\n Overtime_Hours   : "
                         +employees.get(i).getOvertime()+"\n\n") ;
             break;
             }
              else
                 txtarea.setText("Oops ! The employee that you enter does not exist");
         
       
    }

        @Override
    public void actionPerformed(ActionEvent ae) {

           if(ae.getSource().equals(btnsave))
        
    {
        save();
    }
        
       
     
       else if (ae.getSource().equals(btnshow))
        {
           
            txtarea.setText("");
            for(int i=0 ;i<employees.size();i++)
        {
           
          txtarea.setText(txtarea.getText()+"Data of Employee \n\n"+"\nName : "+employees.get(i).getName()
                  +"\n ID             : "+employees.get(i).getId()
                  +"\n Address        : "+employees.get(i).getAddress()
                  +"\n rank           : "+employees.get(i).getRank()
                  +"\nHours_Worked    : "+employees.get(i).getHoursworked()
                  +"\n Overtime_Hours : "+employees.get(i).getOvertime()+"\n\n"
                  ) ;
            
        }
           
        }
       else if(ae.getSource().equals(btnsearch))
       {
           search();
       }
        else if(ae.getSource().equals(btnedit))
        {
            edit();
        }


    }
        
        
}
