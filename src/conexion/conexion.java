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
import tryparse.TryParse;

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
    TryParse tp=new TryParse();
    
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
"                      patente varchar(30) primary key," +
"                      marca varchar(255)," +
"                      modelo varchar(255)," +
"                      ano int " +
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
    
    public void datosDefecto(){
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
        sql="insert into auto values ('aa-bb-07','Fiat','Fiorino',2008);";
        sentencia.execute(sql);
        sql="insert into auto values ('aa-bb-08','Fiat','Fiorino',2010);";
        sentencia.execute(sql);
        sql="insert into auto values ('aa-bb-09','Fiat','Fiorino',2001);";
        sentencia.execute(sql);
        sql="insert into auto values ('aa-bb-10','Fiat','Fiorino',2018);";
        sentencia.execute(sql);
        sql="insert into auto values ('aa-bb-11','Fiat','uno Sporting',2019);";
        sentencia.execute(sql);
        sql="insert into auto values ('aa-bb-12','Fiat','uno Sporting',2018);";
        sentencia.execute(sql);
        sql="insert into auto values ('aa-bb-13','Fiat','uno Sporting',2018);";
        sentencia.execute(sql);
        sql="insert into auto values ('aa-bb-14','Fiat','uno Sporting',2018);";
        sentencia.execute(sql);
        sql="insert into auto values ('aa-bb-15','Fiat','uno Sporting',2019);";
        sentencia.execute(sql);
        sql="insert into auto values ('aa-bb-16','Fiat','uno Sporting',2019);";
        sentencia.execute(sql);
        sql="insert into cliente values (10000001,'Alberto','1999-06-06','Masculino');";
        sentencia.execute(sql);
        sql="insert into cliente values ('10000002','Analcleto','1998-06-06','Masculino');";
        sentencia.execute(sql);
        sql="insert into cliente values ('10000003','Analcleta','1997-06-06','Femenino');";
        sentencia.execute(sql);
        sql="insert into cliente values ('10000004','Travestino','1996-06-06','Otro');";
        sentencia.execute(sql);
        sql="insert into cliente values ('10000005','Hitler','1995-06-06','Masculino');";
        sentencia.execute(sql);
        sql="insert into cliente values ('10000006','lucia hiriart','1492-06-06','Otro');";
        sentencia.execute(sql);
        sql="insert into cliente values ('10000007','Augusto Pinochet','1915-06-06','Masculino');";
        sentencia.execute(sql);
        sql="insert into cliente values ('10000008','Elsa Brozon','1994-06-06','Femenino');";
        sentencia.execute(sql);
        sql="insert into cliente values ('10000009','James Gosling','1955 -06-06','Masculino');";
        sentencia.execute(sql);
        sql="insert into cliente values ('10000010','Guido van Rossum','1956-06-06','Masculino');";
        sentencia.execute(sql);
        sql="insert into sucursal values(1,'Macul','Av.Macul 133',4645645);";
        sentencia.execute(sql);
        sql="insert into sucursal values(2,'Macul2','Av.Macul 1201',12354763);";
        sentencia.execute(sql);
        sql="insert into sucursal values(3,'Ñuñoa1','Av.Pedro de Valdivia 1323',54621354);";
        sentencia.execute(sql);
        sql="insert into sucursal values(4,'Ñuñoa2','Av.Pedro de Valdivia 1234',45621354);";
        sentencia.execute(sql);
        sql="insert into sucursal values(5,'Peñalolen1','Av.Las Torres 1223',456231564);";
        sentencia.execute(sql);
        sql="insert into sucursal values(6,'Peñalolen2','Av.Las Torres 42135',4562135463);";
        sentencia.execute(sql);
        sql="insert into sucursal values(7,'Estacion Central1','Av.Alameda 45645',12321345);";
        sentencia.execute(sql);
        sql="insert into sucursal values(8,'Estacion Central2','Av.Alameda 35234',13213546);";
        sentencia.execute(sql);
        sql="insert into sucursal values(9,'Maipu2','calle falsa 133',45645231);";
        sentencia.execute(sql);
        sql="insert into sucursal values(10,'Maipu2','calle verdadera 133',45623456);";
        sentencia.execute(sql);
        sql="insert into contrato values(1,'10000001','2018-05-05','2019-05-05','aa-bb-07',1);";
        sentencia.execute(sql);
        sql="insert into contrato values(2,'10000002','2018-05-05','2019-05-05','aa-bb-08',2);";
        sentencia.execute(sql);
        sql="insert into contrato values(3,'10000003','2018-05-05','2019-05-05','aa-bb-09',3);";
        sentencia.execute(sql);
        sql="insert into contrato values(4,'10000004','2018-05-05','2019-05-05','aa-bb-10',4);";
        sentencia.execute(sql);
        sql="insert into contrato values(5,'10000005','2018-05-05','2019-05-05','aa-bb-11',5);";
        sentencia.execute(sql);
        sql="insert into contrato values(6,'10000006','2018-05-05','2019-05-05','aa-bb-12',6);";
        sentencia.execute(sql);
        sql="insert into contrato values(7,'10000007','2018-05-05','2019-05-05','aa-bb-13',7);";
        sentencia.execute(sql);
        sql="insert into contrato values(8,'10000007','2018-05-05','2019-05-05','aa-bb-14',8);";
        sentencia.execute(sql);
        sql="insert into contrato values(9,'10000008','2018-05-05','2019-05-05','aa-bb-15',9);";
        sentencia.execute(sql);
        sql="insert into contrato values(10,'10000010','2018-05-05','2019-05-05','aa-bb-16',10);";
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

    public void buscarUsuarios(JTable tabla,String entrada){
    try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            
            String sql="select * from usuario";
            ResultSet resultado= sentencia.executeQuery(sql);
            int fila=0;
            if(tp.TryInt(entrada)){
            while(resultado.next()){
                if(resultado.getInt("permisos")==Integer.valueOf(entrada)){
                    tabla.setValueAt(resultado.getString("nombre_usuario"), fila, 0);
                    tabla.setValueAt(resultado.getString("contrasena"), fila, 1);
                    tabla.setValueAt(resultado.getInt("permisos"), fila, 2);
                    fila++;
                }
            }
            }
            while(resultado.next()){
                if(resultado.getString("nombre_usuario").equals(entrada) || resultado.getString("contrasena").equals(entrada)){
                    tabla.setValueAt(resultado.getString("nombre_usuario"), fila, 0);
                    tabla.setValueAt(resultado.getString("contrasena"), fila, 1);
                    tabla.setValueAt(resultado.getInt("permisos"), fila, 2);
                    fila++;
                }
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
   
    public void buscarcontratos(JTable tabla,String entrada){
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
            if(tp.TryInt(entrada)){
                while(resultado.next()){
                    if(resultado.getInt("folio")==Integer.valueOf(entrada)){
                        tabla.setValueAt(resultado.getInt("folio"), fila, 0);
                        tabla.setValueAt(resultado.getString("nombre"), fila, 1);
                        tabla.setValueAt(resultado.getString("fecha_comienzo"), fila, 2);
                        tabla.setValueAt(resultado.getString("fecha_termino"), fila, 3);
                        tabla.setValueAt(resultado.getString("patente_auto"), fila, 4);
                        tabla.setValueAt(resultado.getString("nombre_sucursal"), fila, 5);
                        fila++;
                    }
                }
            }
            
            while(resultado.next()){
                if(resultado.getString("nombre").equals(entrada)||resultado.getString("fecha_comienzo").equals(entrada)
                || resultado.getString("fecha_termino").equals(entrada)||resultado.getString("patente_auto").equals(entrada)
                ||resultado.getString("nombre_sucursal").equals(entrada)){
                    tabla.setValueAt(resultado.getInt("folio"), fila, 0);
                    tabla.setValueAt(resultado.getString("nombre"), fila, 1);
                    tabla.setValueAt(resultado.getString("fecha_comienzo"), fila, 2);
                    tabla.setValueAt(resultado.getString("fecha_termino"), fila, 3);
                    tabla.setValueAt(resultado.getString("patente_auto"), fila, 4);
                    tabla.setValueAt(resultado.getString("nombre_sucursal"), fila, 5);
                    fila++;
                }
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
    
    public void buscarcontratoscliente(JTable tabla,String entrada){
    try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            
            String sql="select * from contrato " +
                        "join cliente " +
                        "on cliente.rut=contrato.rut_cliente ";
            ResultSet resultado= sentencia.executeQuery(sql);
            int fila=0;
            if(tp.TryInt(entrada)){
                while(resultado.next()){
                    if(resultado.getInt("folio")==Integer.parseInt(entrada)){
                        tabla.setValueAt(resultado.getInt("folio"), fila, 0);
                        tabla.setValueAt(resultado.getString("nombre"), fila, 1);
                        fila++;
                    }
                }
            }
            while(resultado.next()){
                if(resultado.getString("nombre").equals(entrada)){
                    tabla.setValueAt(resultado.getInt("folio"), fila, 0);
                    tabla.setValueAt(resultado.getString("nombre"), fila, 1);
                    fila++;
                }
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
                "WHERE cod_sucursal="+codigo+";";
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
                "SET cod_sucursal = "+entrada+" " +
                "WHERE cod_sucursal="+codigo+";";
            }else
            if (eleccion==2){
             sql="UPDATE sucursal "+
                "SET nombre_sucursal = '"+entrada+"' " +
                "WHERE cod_sucursal="+codigo+";";
            }
            if(eleccion==3){
             sql="UPDATE sucursal "+
                "SET direccion = '"+entrada+"' "+
                "WHERE cod_sucursal="+codigo+";";
            }
            if(eleccion==4){
             sql="UPDATE sucursal "+
                "SET telefono = "+entrada+" " +
                "WHERE cod_sucursal="+codigo+";";
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

    public void buscarsucursal(JTable tabla,String entrada){
    try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            
            String sql="select * from sucursal ";
            ResultSet resultado= sentencia.executeQuery(sql);
            int fila=0;
            if(tp.TryInt(entrada)){
                while(resultado.next()){
                    if(resultado.getInt("cod_sucursal")==Integer.valueOf(entrada) ||
                    resultado.getInt("telefono")==Integer.valueOf(entrada)){
                        tabla.setValueAt(resultado.getInt("cod_sucursal"), fila, 0);
                        tabla.setValueAt(resultado.getString("nombre_sucursal"), fila, 1);
                        tabla.setValueAt(resultado.getString("direccion"), fila, 2);
                        tabla.setValueAt(resultado.getInt("telefono"), fila, 3);
                        fila++;
                    }
                }
            }
            while(resultado.next()){
                if(resultado.getString("nombre_sucursal").equals(entrada) || resultado.getString("direccion").equals(entrada)){
                    tabla.setValueAt(resultado.getInt("cod_sucursal"), fila, 0);
                    tabla.setValueAt(resultado.getString("nombre_sucursal"), fila, 1);
                    tabla.setValueAt(resultado.getString("direccion"), fila, 2);
                    tabla.setValueAt(resultado.getInt("telefono"), fila, 3);
                    fila++;
                }
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
    
    public void buscarclientes(JTable tabla,String entrada){
    try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            
            String sql="select * from cliente ";
            ResultSet resultado= sentencia.executeQuery(sql);
            int fila=0;
            while(resultado.next()){
                if(resultado.getString("rut").equals(entrada) || resultado.getString("nombre").equals(entrada)
                   || resultado.getString("fecha_nacimiento").equals(entrada) || resultado.getString("sexo").equals(entrada)){
                    tabla.setValueAt(resultado.getString("rut"), fila, 0);
                    tabla.setValueAt(resultado.getString("nombre"), fila, 1);
                    tabla.setValueAt(resultado.getString("fecha_nacimiento"), fila, 2);
                    tabla.setValueAt(resultado.getString("sexo"), fila, 3);
                    fila++;
                }
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

    public void buscarautos(JTable tabla,String entrada){
    try{
            Class.forName(DRIVER);
            conexion=DriverManager.getConnection(URL);
            sentencia=conexion.createStatement();
            
            String sql="select * from auto ";
            ResultSet resultado= sentencia.executeQuery(sql);
            int fila=0;
            if(tp.TryInt(entrada)){
                while(resultado.next()){
                    if( resultado.getInt("ano")==Integer.valueOf(entrada)){
                        tabla.setValueAt(resultado.getString("patente"), fila, 0);
                        tabla.setValueAt(resultado.getString("marca"), fila, 1);
                        tabla.setValueAt(resultado.getString("modelo"), fila, 2);
                        tabla.setValueAt(resultado.getInt("ano"), fila, 3);
                        fila++;
                    }
                }
            }
            while(resultado.next()){
                if( resultado.getString("patente").equals(entrada) || resultado.getString("marca").equals(entrada)
                        || resultado.getString("modelo").equals(entrada)){
                    tabla.setValueAt(resultado.getString("patente"), fila, 0);
                    tabla.setValueAt(resultado.getString("marca"), fila, 1);
                    tabla.setValueAt(resultado.getString("modelo"), fila, 2);
                    tabla.setValueAt(resultado.getInt("ano"), fila, 3);
                    fila++;
                }
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