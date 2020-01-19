package bd;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
public class BaseDate1 extends JFrame implements ActionListener {
JTextArea txtSalida;
JLabel lId,lNombreLibro,lEditorial, lAutor, lPrecio,
lEliminar, lInsertar, lActualizar, lIdActualizar, lNuevoNombreLibro, lNuevaEditorial,
lNuevoAutor, lNuevoPrecio;
JTextField tfId, tfNombreLibro, tfEditorial, tfAutor, tfPrecio, tfIdActualizar,
tfNuevoNombreLibro, tfNuevaEditorial, tfNuevoAutor, tfNuevoPrecio; 
JButton btnGuardar, btnEliminar, btnActualizar;
JPanel panel;
BaseDate1(){
	super("Base de datos");
	panel = new JPanel();
	panel.setLayout(null);
	txtSalida = new JTextArea();
    JScrollPane scroll = new  JScrollPane(txtSalida);
    scroll.setBounds(10, 10, 860, 350);
    panel.add(scroll);
    
    lInsertar = new JLabel("INSERTAR DATO");
    lInsertar.setBounds(10, 290, 108, 200);
    panel.add(lInsertar);
    lEliminar = new JLabel("ELIMINAR DATO");
    lEliminar.setBounds(310, 380, 108, 20);
    panel.add(lEliminar);
    lActualizar = new JLabel("ACTUALIZAR DATO");
    lActualizar.setBounds(500, 380, 200, 20);
    panel.add(lActualizar);
    
    
    lNombreLibro = new JLabel("Nombre del Libro");
    lNombreLibro.setBounds(10, 410, 121, 20);
    panel.add(lNombreLibro);
    tfNombreLibro = new JTextField();
    tfNombreLibro.setBounds(131, 410, 100, 20);
    panel.add(tfNombreLibro);
    lEditorial = new JLabel("Editorial");
    lEditorial.setBounds(10, 440, 100, 20);
    panel.add(lEditorial);
    tfEditorial = new JTextField();
    tfEditorial.setBounds(131, 440, 100, 20);
    panel.add(tfEditorial);
    lAutor = new JLabel("Autor");
    lAutor.setBounds(10, 470, 100, 20);
    panel.add(lAutor);
    tfAutor = new JTextField();
    tfAutor.setBounds(131, 470, 100, 20);
    panel.add(tfAutor);
    lPrecio = new JLabel("Precio");
    lPrecio.setBounds(10, 500, 100, 20);
    panel.add(lPrecio);
    tfPrecio = new JTextField();
    tfPrecio.setBounds(131, 500, 100, 20);
    panel.add(tfPrecio);
    btnGuardar = new JButton("GUARDAR");
    btnGuardar.setBounds(10, 530, 100, 20);
    btnGuardar.addActionListener(this);
    panel.add(btnGuardar);
    lId = new JLabel("Id Elimnar");
    lId.setBounds(310, 420, 70, 20);
    panel.add(lId);
    tfId = new JTextField();
    tfId.setBounds(390, 420, 100, 20);
    panel.add(tfId);
    btnEliminar = new JButton("ELIMINAR");
    btnEliminar.setBounds(310, 450, 100, 20);
    btnEliminar.addActionListener(this);
    panel.add(btnEliminar);
    
    lIdActualizar = new JLabel("ID a Actualizar");
    lIdActualizar.setBounds(500, 410, 120, 20);
    panel.add(lIdActualizar);
    tfIdActualizar = new JTextField();
    tfIdActualizar.setBounds(607, 410, 100, 20);
    panel.add(tfIdActualizar);
    lNuevoNombreLibro = new JLabel("Nuevo Libro");
    lNuevoNombreLibro.setBounds(500, 440, 100, 20);
    panel.add(lNuevoNombreLibro);
    tfNuevoNombreLibro = new JTextField();
    tfNuevoNombreLibro.setBounds(607, 440, 100, 20);
    panel.add(tfNuevoNombreLibro);
    lNuevaEditorial = new JLabel("Nueva Editorial");
    lNuevaEditorial.setBounds(500, 470, 108, 20);
    panel.add(lNuevaEditorial);
    tfNuevaEditorial = new JTextField();
    tfNuevaEditorial.setBounds(607, 470, 100, 20);
    panel.add(tfNuevaEditorial);
    lNuevoAutor = new JLabel("Nuevo Autor");
    lNuevoAutor.setBounds(500, 500, 100, 20);
    panel.add(lNuevoAutor);
    tfNuevoAutor = new JTextField();
    tfNuevoAutor.setBounds(607, 500, 100, 20);
    panel.add(tfNuevoAutor);
    lNuevoPrecio = new JLabel("Nuevo Precio");
    lNuevoPrecio.setBounds(500, 530, 100, 20);
    panel.add(lNuevoPrecio);
    tfNuevoPrecio = new JTextField();
    tfNuevoPrecio.setBounds(607, 530, 100, 20);
    panel.add(tfNuevoPrecio);
    btnActualizar = new JButton("ACTUALIZAR");
    btnActualizar.setBounds(500, 560, 120, 20);
    panel.add(btnActualizar);
    
    add(panel);
    setSize(900, 650);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    //colocar la ventana  en la mitad de la pantalla
    setLocationRelativeTo(null);
    mostrarDatos();
 
}


	public void mostrarDatos(){
		txtSalida.setText(""); //vaciamos texto de salida
		Connection c = ConexionBD1.getConexion();
		Statement comando;
		try{
			comando = c.createStatement();
			ResultSet registro = comando.executeQuery("select Id, NombreLibro, Editorial, Autor, Precio from libros where 1 ORDER BY id desc");
		    txtSalida.setText("SALIDA DE DATOS \n");
		    while(registro.next()){
		    	int id, precio;
		    	String nombreLibro, editorial, autor;
		    	id=registro.getInt("Id");
		    	nombreLibro=registro.getString("NombreLibro");
		    	editorial=registro.getString("Editorial");
		    	autor=registro.getString("Autor");
		    	precio=registro.getInt("Precio");
		    	txtSalida.append((id+"|"+nombreLibro+"|"+editorial+"|"+autor+"|"+precio)+"\n");
		    }
	}
		catch(SQLException e1){
			e1.printStackTrace();
			}
		ConexionBD1.desconectar();
		}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==btnGuardar){
			Connection c = ConexionBD1.getConexion();
			String sql = "INSERT INTO libros (NombreLibro, Editorial, Autor, Precio)"+ "VALUES(?, ?, ?, ?)";
			try{
				PreparedStatement st = c.prepareStatement(sql);	
				st.setString(1, tfNombreLibro.getText());
				st.setString(2, tfEditorial.getText());
				st.setString(3, tfAutor.getText());
				st.setString(4, tfPrecio.getText());
				st.execute();
				//vaciomos campos  de entrada
				tfNombreLibro.setText("");
				tfEditorial.setText("");
				tfAutor.setText("");
				tfPrecio.setText("");
				st.close();
			}
			catch(SQLException e1){
				e1.printStackTrace();
			}
			mostrarDatos();
			ConexionBD1.desconectar();	
			}
		if(e.getSource()==btnEliminar){
			Connection c = ConexionBD1.getConexion();
			String sql = "DELET FROM libros WHERE id = ?";
			try{
				PreparedStatement st = c.prepareStatement(sql);
				st.setString(1, tfId.getText());
				st.executeUpdate();
				//vaciamos campos de entrada
				tfId.setText("");
				st.close();
			}
			catch(SQLException e1){
				e1.printStackTrace();
			}
			mostrarDatos();
			ConexionBD1.desconectar();
		}
		
		if(e.getSource()==btnActualizar){
			Connection c = ConexionBD1.getConexion();
			String sql = "UPDATE libros SET NombreLibro = ?, Editorial = ?, Autor = ?, Precio = ? WHERE Id = ?";
            try{
            	PreparedStatement st = c.prepareStatement(sql);
            	st.setString(1, tfNuevoNombreLibro.getText());
            	st.setString(2, tfNuevaEditorial.getText());
            	st.setString(3, tfNuevoAutor.getText());
            	st.setString(4, tfNuevoPrecio.getText());
            	
            }
            catch(SQLException e1){
            	e1.printStackTrace();
            }
            mostrarDatos();
            ConexionBD1.desconectar();
		}
		}
	
	public static void main(String [] args){
		BaseDate1 bd = new BaseDate1();
	}
	}
	
	
	
	
