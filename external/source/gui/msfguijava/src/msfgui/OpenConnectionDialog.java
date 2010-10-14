/*
 * UserPassDialog.java
 *
 * Created on May 15, 2010, 12:53:23 PM
 */
package msfgui;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.w3c.dom.Element;

/**
 *
 * @author scriptjunkie
 */
public class OpenConnectionDialog extends javax.swing.JDialog {
	MainFrame mainframe;
	RpcConnection rpcConn;

	/** Creates new form UserPassDialog */
	public OpenConnectionDialog(boolean modal, MainFrame mainframe) {
		super(mainframe.getFrame(), modal);
		this.mainframe = mainframe;
		initComponents();
		setTitle("msfgui");
		org.jdesktop.application.ResourceMap resourceMap 
				= org.jdesktop.application.Application.getInstance(msfgui.MsfguiApp.class)
				.getContext().getResourceMap(ModulePopup.class);
		this.setIconImage(resourceMap.getImageIcon("main.icon").getImage());
	}

	public static RpcConnection getConnection(MainFrame mainframe) {
		//try saved connection credentials
		try{
			Element info = MsfguiApp.getPropertiesNode();
			String username = info.getAttributeNode("username").getValue();
			String password = info.getAttributeNode("password").getValue();
			String host = info.getAttributeNode("host").getValue();
			int port = Integer.parseInt(info.getAttributeNode("port").getValue());
			return new RpcConnection(username, password.toCharArray(), host, port);
		} catch (MsfException mex) {
		} catch (NullPointerException nex) {//generated when attributes dont exist.
		}
		//Darn. open the gui anyway
		OpenConnectionDialog diag = new OpenConnectionDialog(true, mainframe);
		diag.setVisible(true);
		return diag.getConnection();
	}

	public RpcConnection getConnection() {
		return rpcConn;
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        hostLabel = new javax.swing.JLabel();
        portLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        hostField = new javax.swing.JTextField();
        portField = new javax.swing.JTextField();
        connectButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        startNewButton = new javax.swing.JButton();
        pathButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(msfgui.MsfguiApp.class).getContext().getResourceMap(OpenConnectionDialog.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N

        titleLabel.setText(resourceMap.getString("titleLabel.text")); // NOI18N
        titleLabel.setName("titleLabel"); // NOI18N

        usernameLabel.setText(resourceMap.getString("usernameLabel.text")); // NOI18N
        usernameLabel.setName("usernameLabel"); // NOI18N

        passwordLabel.setText(resourceMap.getString("passwordLabel.text")); // NOI18N
        passwordLabel.setName("passwordLabel"); // NOI18N

        hostLabel.setText(resourceMap.getString("hostLabel.text")); // NOI18N
        hostLabel.setName("hostLabel"); // NOI18N

        portLabel.setText(resourceMap.getString("portLabel.text")); // NOI18N
        portLabel.setName("portLabel"); // NOI18N

        usernameField.setText(resourceMap.getString("usernameField.text")); // NOI18N
        usernameField.setName("usernameField"); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        passwordField.setText(resourceMap.getString("passwordField.text")); // NOI18N
        passwordField.setName("passwordField"); // NOI18N
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        hostField.setText(resourceMap.getString("hostField.text")); // NOI18N
        hostField.setName("hostField"); // NOI18N
        hostField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostFieldActionPerformed(evt);
            }
        });

        portField.setText(resourceMap.getString("portField.text")); // NOI18N
        portField.setName("portField"); // NOI18N
        portField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portFieldActionPerformed(evt);
            }
        });

        connectButton.setFont(connectButton.getFont());
        connectButton.setText(resourceMap.getString("connectButton.text")); // NOI18N
        connectButton.setName("connectButton"); // NOI18N
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(cancelButton.getFont());
        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        startNewButton.setFont(startNewButton.getFont().deriveFont(startNewButton.getFont().getStyle() | java.awt.Font.BOLD));
        startNewButton.setText(resourceMap.getString("startNewButton.text")); // NOI18N
        startNewButton.setName("startNewButton"); // NOI18N
        startNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startNewButtonActionPerformed(evt);
            }
        });

        pathButton.setText(resourceMap.getString("pathButton.text")); // NOI18N
        pathButton.setName("pathButton"); // NOI18N
        pathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hostLabel)
                                    .addComponent(passwordLabel)
                                    .addComponent(portLabel)))
                            .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                            .addComponent(hostField, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                            .addComponent(portField, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(startNewButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pathButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(connectButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hostLabel)
                    .addComponent(hostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(startNewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(pathButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(connectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
		String username = usernameField.getText();
		char[] password = passwordField.getPassword();
		String host = hostField.getText();
		int port = Integer.parseInt(portField.getText());
		try {
			rpcConn = new RpcConnection(username, password, host, port);
		} catch (MsfException mex) {
			rpcConn = null;
		}
		setVisible(false);
	}//GEN-LAST:event_connectButtonActionPerformed

	private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
		rpcConn = null;
		setVisible(false);
	}//GEN-LAST:event_cancelButtonActionPerformed

	private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
		connectButtonActionPerformed(evt);
	}//GEN-LAST:event_usernameFieldActionPerformed

	private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
		connectButtonActionPerformed(evt);
	}//GEN-LAST:event_passwordFieldActionPerformed

	private void hostFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostFieldActionPerformed
		connectButtonActionPerformed(evt);
	}//GEN-LAST:event_hostFieldActionPerformed

	private void portFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portFieldActionPerformed
		connectButtonActionPerformed(evt);
	}//GEN-LAST:event_portFieldActionPerformed

	private void startNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startNewButtonActionPerformed
		//Setup defaults
		RpcConnection.defaultUser = usernameField.getText();
		if(passwordField.getPassword().length > 0)
			RpcConnection.defaultPass = new String(passwordField.getPassword());
		if(hostField.getText().length() > 0)
			RpcConnection.defaultHost = hostField.getText();
		RpcConnection.defaultPort  = Integer.parseInt(portField.getText());
		//do the action. There's probably a "right" way to do  Oh well.
		mainframe.getContext().getActionMap(mainframe).get("startRpc").actionPerformed(new java.awt.event.ActionEvent(startNewButton,1234,""));
		setVisible(false);
	}//GEN-LAST:event_startNewButtonActionPerformed

	private void pathButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathButtonActionPerformed
		File dir =new File("/opt/metasploit3/msf3/");
		if(dir.isDirectory())
			MsfguiApp.fileChooser.setCurrentDirectory(dir);
		dir =new File(MsfguiApp.getPropertiesNode().getAttribute("commandPrefix"));
		if(dir.isDirectory())
			MsfguiApp.fileChooser.setCurrentDirectory(dir);
		if (MsfguiApp.fileChooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION)
			return;
		MsfguiApp.getPropertiesNode().setAttribute("commandPrefix",
				MsfguiApp.fileChooser.getCurrentDirectory().getPath()+File.separator);
		JOptionPane.showMessageDialog(this, "Will now try running \n"
				+MsfguiApp.getPropertiesNode().getAttribute("commandPrefix")+"msfrpcd\n"
				+"and "+ MsfguiApp.getPropertiesNode().getAttribute("commandPrefix")+"ruby /msf3/msfrpcd\n"
				+ "when starting new daemon. Note: for the second to work on Windows,\n"
				+ "use something like Framework3\\bin not Framework3\\msf3");
	}//GEN-LAST:event_pathButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton connectButton;
    private javax.swing.JTextField hostField;
    private javax.swing.JLabel hostLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton pathButton;
    private javax.swing.JTextField portField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JButton startNewButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
