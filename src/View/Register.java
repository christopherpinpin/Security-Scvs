
package View;

import Model.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JPanel {

    public Frame frame;
    
    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JTextField();
        usernameFld = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        confpassFld = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        errorMsg = new javax.swing.JLabel();
        errorMsg1 = new javax.swing.JLabel();
        errorMsg2 = new javax.swing.JLabel();

        registerBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        registerBtn.setText("REGISTER");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        passwordFld.setBackground(new java.awt.Color(240, 240, 240));
        passwordFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        passwordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFldKeyReleased(evt);
            }
        });

        usernameFld.setBackground(new java.awt.Color(240, 240, 240));
        usernameFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        usernameFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "USERNAME", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        usernameFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameFldKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SECURITY Svcs");
        jLabel1.setToolTipText("");

        confpassFld.setBackground(new java.awt.Color(240, 240, 240));
        confpassFld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confpassFld.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confpassFld.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "CONFIRM PASSWORD", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        confpassFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                confpassFldKeyReleased(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        errorMsg.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        errorMsg.setForeground(new java.awt.Color(255, 0, 0));
        errorMsg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        errorMsg.setToolTipText("");

        errorMsg1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        errorMsg1.setForeground(new java.awt.Color(255, 0, 0));
        errorMsg1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        errorMsg1.setToolTipText("");

        errorMsg2.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        errorMsg2.setForeground(new java.awt.Color(255, 0, 0));
        errorMsg2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        errorMsg2.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameFld)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confpassFld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorMsg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorMsg2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorMsg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(274, 274, 274))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(confpassFld, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        
        boolean passMatch = false;
        boolean usernameValid = false;
        boolean passValid = false;
        
        if(passwordFld.getText().equals(confpassFld.getText())){
            passMatch = true;
        }
        
        if(frame.main.sqlite.getUser(usernameFld.getText().toLowerCase()) == null){
            usernameValid = true;
        }
        
        if(passwordFld.getText().length() > 7){
            passValid = true;
        }
        
        if(!usernameValid){
            JOptionPane.showMessageDialog(frame,
                    "Username already exists.",
                     "Registration Error",
                 JOptionPane.ERROR_MESSAGE);
        }
        else if(!passValid){
            JOptionPane.showMessageDialog(frame,
                    "Password must be atleast 8 characters.",
                     "Registration Error",
                 JOptionPane.ERROR_MESSAGE);
        }
        else if(!passMatch){
            JOptionPane.showMessageDialog(frame,
                    "Confirm password does not match password.",
                     "Registration Error",
                 JOptionPane.ERROR_MESSAGE);
        }
        else{
            String password = frame.main.hashPassword(passwordFld.getText());
            frame.registerAction(usernameFld.getText().toLowerCase(), password, confpassFld.getText());
            usernameFld.setText("");
            passwordFld.setText("");
            confpassFld.setText("");
            errorMsg.setText("");
            errorMsg1.setText("");
            errorMsg2.setText("");
            frame.loginNav();
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        usernameFld.setText("");
        passwordFld.setText("");
        confpassFld.setText("");
        errorMsg.setText("");
        errorMsg1.setText("");
        errorMsg2.setText("");
        frame.loginNav();
    }//GEN-LAST:event_backBtnActionPerformed

    private void usernameFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFldKeyReleased
        ArrayList<User> users = frame.main.sqlite.getUsers();
        String username = usernameFld.getText().toLowerCase();
        int found = -1;
        
        for(int i = 0 ; i < users.size() ; i++){
            if(username.equals(users.get(i).getUsername())){
                found = 1;
            }
        }
        
        if(found == 1){
            errorMsg.setText("Username already exists.");
        }
        else if(username.length() < 5){
            errorMsg.setText("Must be atleast 5 characters.");
        }
        else{
            errorMsg.setText("");
        }
    }//GEN-LAST:event_usernameFldKeyReleased

    private void passwordFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFldKeyReleased
        String password = String.valueOf(passwordFld.getText());
        String puncs = ",./<>?;:'[]{}|-=_+!@#$%^&*()";
        int strength = 0;
        int uppercase = 0;
        int digit = 0;
        int punctuation = 0;
        
        for(int i=0 ; i < password.length() ; i++){
            if(Character.isDigit(password.charAt(i))){
                digit = 1;
            }
            if(Character.isUpperCase(password.charAt(i))){
                uppercase = 1;
            }
            if(puncs.contains("" + password.charAt(i))){
                punctuation = 1;
            }
        }
        strength = uppercase + digit + punctuation;
        if(password.length() < 8){
            errorMsg1.setText("Password must be atleast 8 characters.");
            errorMsg1.setForeground(new java.awt.Color(255, 0, 0));
        }
        else if(strength < 2){
            errorMsg1.setText("Password Strength: Weak");
            errorMsg1.setForeground(new java.awt.Color(255, 0, 0));
        }
        else if(strength == 2){
            errorMsg1.setText("Password Strength: Moderate");
            errorMsg1.setForeground(new java.awt.Color(201, 184, 28));
        }
        else if(strength > 2){
            errorMsg1.setText("Password Strength: Strong");
            errorMsg1.setForeground(new java.awt.Color(28, 184, 0));
        }
        else{
            errorMsg1.setText("");
            errorMsg1.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_passwordFldKeyReleased

    private void confpassFldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confpassFldKeyReleased
        String password = passwordFld.getText();
        String confpass = confpassFld.getText();
        
        if(password.equals(confpass)){
            errorMsg2.setText("Password match.");
            errorMsg2.setForeground(new java.awt.Color(28, 184, 0));
        }
        else{
            errorMsg2.setText("Password does not match.");
            errorMsg2.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_confpassFldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField confpassFld;
    private javax.swing.JLabel errorMsg;
    private javax.swing.JLabel errorMsg1;
    private javax.swing.JLabel errorMsg2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField passwordFld;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables
}
