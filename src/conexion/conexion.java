/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author RLCR
 */
public class conexion {

    Connection conexion= null;
    Statement sentencia=null;
    ResultSet resultado=null;
    String NOMBREBD="empresa.sqlite";
    String URL="jdbc:sqlite:"+NOMBREBD;
    String DRIVER="org.sqlite.JDBC";
    
    public void crearBD(){
    try{
    
        Class.forName(DRIVER);
        conexion=DriverManager.getConnection(URL);
        
    }catch(ClassNotFoundException | SQLException e){
        System.out.println("ERROR:"+e.getMessage());
    }
    
        System.out.println("Base de datos creada con exito!");
    }
    
    public void crearTablas(){
    try{

            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="create table auto (" +
"                      patente varchar(10) primary key," +
"                      marca varchar(255)," +
"                      modelo varchar(255)," +
"                      ano int" +
");";
sentencia.execute(sql);
sql="create table sucursal (" +
"                      cod_sucursal int primary key," +
"                      nombre_sucursal varchar(255)," +
"                      direccion varchar(255)," +
"                      telefono int" +
");";
sentencia.execute(sql);
sql="create table cliente (" +
"                      rut varchar(20) primary key," +
"                      nombre varchar(255)," +
"                      fecha_nacimiento date," +
"                      sexo varchar(10)" +
");";
sentencia.execute(sql);
sql="create table usuario (" +
"                      nombre_usuario varchar(50) primary key," +
"                      contrasena varchar(255)," +
"                      permisos int" +
");";
sentencia.execute(sql);
sql="create table contrato(" +
"                        folio int primary key," +
"                        rut_cliente varchar(12)," +
"                        fecha_comienzo date," +
"                        fecha_termino date," +
"                        patente_auto varchar(10)," +
"                        cod_sucursal int,"+ 
"                        CONSTRAINT fk_rut_cliente"+
"                        FOREIGN KEY(rut_cliente) "+
"                        REFERENCES cliente(rut),"+
"                        CONSTRAINT fk_patente_auto "+
"                        FOREIGN KEY(patente_auto) "+
"                        REFERENCES auto(patente),"+
"                        CONSTRAINT fk_cod_sucursal"+
"                        FOREIGN KEY(cod_sucursal) "+
"                        REFERENCES sucursal(cod_sucursal)" +
");";
sentencia.execute(sql);

            sentencia.close();
            conexion.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("ERROR:"+e.getMessage());
        }
    }
    
    public void usuariosDefecto(){
    try{
    
        Class.forName(DRIVER);
        conexion=DriverManager.getConnection(URL);
        sentencia=conexion.createStatement();
        String sql="insert into usuario values ('Usuarios','Admin',1);";
        sentencia.execute(sql);
        sql="insert into usuario values ('Contratos','Admin',2);";
        sentencia.execute(sql);
        sql="insert into usuario values ('Sucursales','Admin',3);";
        sentencia.execute(sql);
        sql="insert into usuario values ('Clientes','Admin',4);";
        sentencia.execute(sql);
        sql="insert into usuario values ('Autos','Admin',5);";
        sentencia.execute(sql);
        sql="insert into usuario values ('Admin','Admin',6);";
        sentencia.execute(sql);
        sql="insert into usuario values ('SucursalesAutos','Admin',7);";
        sentencia.execute(sql);
        sql="insert into usuario values ('ContratosClientes','Admin',8);";
        sentencia.execute(sql);
        sentencia.close();
        conexion.close();
    }catch(ClassNotFoundException | SQLException e){
        System.out.println("ERROR:"+e.getMessage());
    }
    
        System.out.println("datos insertados con exito!");
    }
   
    public String logear(String nombre){
        String salida="";
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="select * from usuario where nombre_usuario='"+nombre+"';";
            ResultSet resultado= sentencia.executeQuery(sql);
            salida=resultado.getString("nombre_usuario");
            salida=salida+","+resultado.getString("contrasena");
            salida=salida+","+String.valueOf(resultado.getInt("permisos"));
            sentencia.close();
            conexion.close();
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("ERROR:"+e.getMessage());
        }

            System.out.println("consulta realizada!");
            return salida;
        }
    
    public void insertar_usuario(String nombre,String contra,int permisos){
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="insert into usuario values ('"+nombre+"','"+contra+"',"+permisos+");";
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrarUsuarios(JTable tabla){
    try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            
            String sql="select * from usuario";
            ResultSet resultado= sentencia.executeQuery(sql);
            int fila=0;
            while(resultado.next()){
                tabla.setValueAt(resultado.getString("nombre_usuario"), fila, 0);
                tabla.setValueAt(resultado.getString("contrasena"), fila, 1);
                tabla.setValueAt(resultado.getInt("permisos"), fila, 2);
                fila++;
            }
            resultado.close();
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarusuario(String entrada, String nombre, int eleccion){
        String sql="";
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            if (eleccion==1){
             sql="UPDATE usuario "+
                "SET nombre_usuario = '"+entrada+"'" +
                "WHERE nombre_usuario='"+nombre+"';";
            }else
            if (eleccion==2){
             sql="UPDATE usuario "+
                "SET contrasena = '"+entrada+"'" +
                "WHERE nombre_usuario='"+nombre+"';";
            }
            else{
             sql="UPDATE usuario "+
                "SET permisos = '"+entrada+"'" +
                "WHERE nombre_usuario='"+nombre+"';";
            }
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }
    
    public void eliminarusuario(String nombre){
        String salida="";
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="DELETE " +
                "FROM usuario " +
                "WHERE nombre_usuario='"+nombre+"';";
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }
    
    public void insertarcontrato(int folio ,String rut_cliente,String fecha_comienzo, String fecha_termino, String patente_auto, int codigo_sucursal){
        String salida="";
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="insert into contrato values ("+folio+",'"+rut_cliente+"','"+fecha_comienzo+"','"+fecha_termino+"','"+patente_auto+"',"+codigo_sucursal+");";
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }

    public void editarcontrato(String entrada, int folio, int eleccion){
        String sql="";
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            if (eleccion==1){
             sql="UPDATE contrato "+
                "SET folio = "+entrada+" " +
                "WHERE folio="+folio+";";
            }else
            if (eleccion==2){
             sql="UPDATE contrato "+
                "SET rut_cliente = '"+entrada+"' " +
                "WHERE folio="+folio+";";
            }
            if(eleccion==3){
             sql="UPDATE contrato "+
                "SET fecha_comienzo = '"+entrada+"' "+
                "WHERE folio="+folio+";";
            }
            if(eleccion==4){
             sql="UPDATE contrato "+
                "SET fecha_termino = '"+entrada+"' " +
                "WHERE folio="+folio+";";
            }
            if(eleccion==5){
             sql="UPDATE contrato "+
                "SET patente_auto = '"+entrada+"' " +
                "WHERE folio="+folio+";";
            }
            if(eleccion==6){
             sql="UPDATE contrato "+
                "SET cod_sucursal = "+entrada+" " +
                "WHERE folio="+folio+";";
            }
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }
    
    public void eliminarcontrato(int folio){
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="DELETE " +
                "FROM contrato " +
                "WHERE folio='"+folio+"';";
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }  

    public void mostrarcontratos(JTable tabla){
    try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            
            String sql="select * from contrato " +
                        "join cliente " +
                        "on cliente.rut=contrato.rut_cliente " +
                        "join sucursal " +
                        "on sucursal.cod_sucursal=contrato.cod_sucursal";
            ResultSet resultado= sentencia.executeQuery(sql);
            int fila=0;
            while(resultado.next()){
                tabla.setValueAt(resultado.getInt("folio"), fila, 0);
                tabla.setValueAt(resultado.getString("nombre"), fila, 1);
                tabla.setValueAt(resultado.getString("fecha_comienzo"), fila, 2);
                tabla.setValueAt(resultado.getString("fecha_termino"), fila, 3);
                tabla.setValueAt(resultado.getString("patente_auto"), fila, 4);
                tabla.setValueAt(resultado.getString("nombre_sucursal"), fila, 5);
                fila++;
            }
            resultado.close();
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();

        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrarcontratoscliente(JTable tabla){
    try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            
            String sql="select * from contrato " +
                        "join cliente " +
                        "on cliente.rut=contrato.rut_cliente ";
            ResultSet resultado= sentencia.executeQuery(sql);
            int fila=0;
            while(resultado.next()){
                tabla.setValueAt(resultado.getInt("folio"), fila, 0);
                tabla.setValueAt(resultado.getString("nombre"), fila, 1);
                fila++;
            }
            resultado.close();
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();

        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void insertarsucursal(int codigo,String nombre,String direccion,int telefono){
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="insert into sucursal values("+codigo+",'"+nombre+"','"+direccion+"',"+telefono+");";
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }

    public void eliminarsucursal(int codigo){
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="DELETE " +
                "FROM sucursal " +
                "WHERE codigo="+codigo+";";
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }  

    public void editarsucursal(String entrada, int codigo, int eleccion){
        String sql="";
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            if (eleccion==1){
             sql="UPDATE sucursal "+
                "SET codigo = "+entrada+" " +
                "WHERE codigo="+codigo+";";
            }else
            if (eleccion==2){
             sql="UPDATE sucursal "+
                "SET nombre = '"+entrada+"' " +
                "WHERE codigo="+codigo+";";
            }
            if(eleccion==3){
             sql="UPDATE sucursal "+
                "SET direccion = '"+entrada+"' "+
                "WHERE codigo="+codigo+";";
            }
            if(eleccion==4){
             sql="UPDATE sucursal "+
                "SET numero = "+entrada+" " +
                "WHERE codigo="+codigo+";";
            }
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }

    public void mostrarsucursal(JTable tabla){
    try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            
            String sql="select * from sucursal ";
            ResultSet resultado= sentencia.executeQuery(sql);
            int fila=0;
            while(resultado.next()){
                tabla.setValueAt(resultado.getInt("cod_sucursal"), fila, 0);
                tabla.setValueAt(resultado.getString("nombre_sucursal"), fila, 1);
                tabla.setValueAt(resultado.getString("direccion"), fila, 2);
                tabla.setValueAt(resultado.getInt("telefono"), fila, 3);
                fila++;
            }
            resultado.close();
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();

        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertarcliente(String rut ,String nombre,String fecha_nacimiento, String sexo){
        String salida="";
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="insert into cliente values ('"+rut+"','"+nombre+"','"+fecha_nacimiento+"','"+sexo+"');";
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }

    public void editarcliente(String entrada, String rut, int eleccion){
        String sql="";
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            if (eleccion==1){
             sql="UPDATE cliente "+
                "SET rut = '"+entrada+"' " +
                "WHERE rut='"+rut+"';";
            }else
            if (eleccion==2){
             sql="UPDATE cliente "+
                "SET nombre = '"+entrada+"' " +
                "WHERE rut='"+rut+"';";
            }
            if(eleccion==3){
             sql="UPDATE cliente "+
                "SET fecha_nacimiento = '"+entrada+"' " +
                "WHERE rut='"+rut+"';";
            }
            if(eleccion==4){
             sql="UPDATE cliente "+
                "SET sexo = '"+entrada+"' " +
                "WHERE rut='"+rut+"';";
            }
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }
    
    public void eliminarcliente(String rut){
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="DELETE " +
                "FROM cliente " +
                "WHERE rut='"+rut+"';";
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }  

    public void mostrarclientes(JTable tabla){
    try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            
            String sql="select * from cliente ";
            ResultSet resultado= sentencia.executeQuery(sql);
            int fila=0;
            while(resultado.next()){
                tabla.setValueAt(resultado.getString("rut"), fila, 0);
                tabla.setValueAt(resultado.getString("nombre"), fila, 1);
                tabla.setValueAt(resultado.getString("fecha_nacimiento"), fila, 2);
                tabla.setValueAt(resultado.getString("sexo"), fila, 3);
                fila++;
            }
            resultado.close();
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();

        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertarauto(String patente ,String marca,String modelo, int ano){
        String salida="";
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="insert into auto values ('"+patente+"','"+marca+"','"+modelo+"','"+ano+"');";
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }
   
    public void editarauto(String entrada, String patente, int eleccion){
        String sql="";
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            if (eleccion==1){
             sql="UPDATE auto "+
                "SET patente = '"+entrada+"' " +
                "WHERE patente='"+patente+"';";
            }else
            if (eleccion==2){
             sql="UPDATE auto "+
                "SET marca = '"+entrada+"' " +
                "WHERE patente='"+patente+"';";
            }
            if(eleccion==3){
             sql="UPDATE auto "+
                "SET modelo = '"+entrada+"' " +
                "WHERE patente='"+patente+"';";
            }
            if(eleccion==4){
             sql="UPDATE auto "+
                "SET ano = '"+entrada+"' " +
                "WHERE patente='"+patente+"';";
            }
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }
    
    public void eliminarauto(String patente){
        try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            String sql="DELETE " +
                "FROM auto " +
                "WHERE patente='"+patente+"';";
            sentencia.execute(sql);
            sentencia.close();
            conexion.close();
            JOptionPane.showMessageDialog (null, "Consulta realizada con exito", "Consulta realizada con exito", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
                        JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
            System.out.println("consulta realizada!");
    }  

    public void mostrarautos(JTable tabla){
    try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            
            String sql="select * from auto ";
            ResultSet resultado= sentencia.executeQuery(sql);
            int fila=0;
            while(resultado.next()){
                tabla.setValueAt(resultado.getString("patente"), fila, 0);
                tabla.setValueAt(resultado.getString("marca"), fila, 1);
                tabla.setValueAt(resultado.getString("modelo"), fila, 2);
                tabla.setValueAt(resultado.getInt("ano"), fila, 3);
                fila++;
            }
            resultado.close();
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();

        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(
        null, "error: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}