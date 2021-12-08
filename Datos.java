package datos;
public class Datos {
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidoPat() {
        return ApellidoPat;
    }

    public void setApellidoPat(String ApellidoPat) {
        this.ApellidoPat = ApellidoPat;
    }

    public String getApellidoMat() {
        return ApellidoMat;
    }

    public void setApellidoMat(String ApellidoMat) {
        this.ApellidoMat = ApellidoMat;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getFech() {
        return Fech;
    }

    public void setFech(String Fech) {
        this.Fech = Fech;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public String getDeparta() {
        return Departa;
    }

    public void setDeparta(String Departa) {
        this.Departa = Departa;
    }

    public String getNombreDep() {
        return NombreDep;
    }

    public void setNombreDep(String NombreDep) {
        this.NombreDep = NombreDep;
    }

    public String getDescripDep() {
        return DescripDep;
    }

    public void setDescripDep(String DescripDep) {
        this.DescripDep = DescripDep;
    }

    public int getIdProyect() {
        return IdProyect;
    }

    public void setIdProyect(int IdProyect) {
        this.IdProyect = IdProyect;
    }

    public String getNombreProyect() {
        return NombreProyect;
    }

    public void setNombreProyect(String NombreProyect) {
        this.NombreProyect = NombreProyect;
    }

    public String getDescriProyect() {
        return DescriProyect;
    }

    public void setDescriProyect(String DescriProyect) {
        this.DescriProyect = DescriProyect;
    }

    public float getPresuProyect() {
        return PresuProyect;
    }

    public void setPresuProyect(float PresuProyect) {
        this.PresuProyect = PresuProyect;
    }

    public String getFechaInProyect() {
        return FechaInProyect;
    }

    public void setFechaInProyect(String FechaInProyect) {
        this.FechaInProyect = FechaInProyect;
    }

    public String getFechaFinProyect() {
        return FechaFinProyect;
    }

    public void setFechaFinProyect(String FechaFinProyect) {
        this.FechaFinProyect = FechaFinProyect;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
    
    //---------------Codigo Empleados Nuevo-------

    public String getEmpNombre() {
        return EmpNombre;
    }

    public void setEmpNombre(String EmpNombre) {
        this.EmpNombre = EmpNombre;
    }

    public String getEmpApellidoPat() {
        return EmpApellidoPat;
    }

    public void setEmpApellidoPat(String EmpApellidoPat) {
        this.EmpApellidoPat = EmpApellidoPat;
    }

    public String getEmpApellidoMat() {
        return EmpApellidoMat;
    }

    public void setEmpApellidoMat(String EmpApellidoMat) {
        this.EmpApellidoMat = EmpApellidoMat;
    }

    public String getEmpDni() {
        return EmpDni;
    }

    public void setEmpDni(String EmpDni) {
        this.EmpDni = EmpDni;
    }

    public String getEmpFech() {
        return EmpFech;
    }

    public void setEmpFech(String EmpFech) {
        this.EmpFech = EmpFech;
    }

    public float getEmpSalario() {
        return EmpSalario;
    }

    public void setEmpSalario(float EmpSalario) {
        this.EmpSalario = EmpSalario;
    }

    public String getEmpDeparta() {
        return EmpDeparta;
    }

    public void setEmpDeparta(String EmpDeparta) {
        this.EmpDeparta = EmpDeparta;
    }

    public Double getEmpedad() {
        return Empedad;
    }

    public void setEmpedad(Double Empedad) {
        this.Empedad = Empedad;
    }

    public String getEmpdirec() {
        return Empdirec;
    }

    public void setEmpdirec(String Empdirec) {
        this.Empdirec = Empdirec;
    }

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int Empid) {
        this.Empid = Empid;
    }
    
    
    
    
    private int Empid;
    private String EmpNombre;
    private String EmpApellidoPat;
    private String EmpApellidoMat;
    private String EmpDni;
    private String EmpFech;
    private float  EmpSalario;
    private String EmpDeparta;
    private double Empedad;
    private String Empdirec;
    
//--------Termina Empleados-----------
    

//------------ Cod Depa---------------------

    public String getDepNombre() {
        return DepNombre;
    }

    public void setDepNombre(String DepNombre) {
        this.DepNombre = DepNombre;
    }

    public String getDepDescrip() {
        return DepDescrip;
    }

    public void setDepDescrip(String DepDescrip) {
        this.DepDescrip = DepDescrip;
    }
 
    private String  DepNombre;
    private String DepDescrip; 
//-------------Termina Depa--------------------    
   
//----------------Cod Citas-----------------

    public int getCitaId() {
        return citaId;
    }

    public void setCitaId(int citaId) {
        this.citaId = citaId;
    }

    public String getCitaFecha() {
        return citaFecha;
    }

    public void setCitaFecha(String citaFecha) {
        this.citaFecha = citaFecha;
    }

    public String getCitaHora() {
        return citaHora;
    }

    public void setCitaHora(String citaHora) {
        this.citaHora = citaHora;
    }

    public int getCitaClienteID() {
        return citaClienteID;
    }

    public void setCitaClienteID(int citaClienteID) {
        this.citaClienteID = citaClienteID;
    }

private int citaId;
private String citaFecha;
private String citaHora;
private int citaClienteID;


//-------------Termina Citas-------------------    
  

//--------------Cod Servicios-------------

    public String getServNombre() {
        return servNombre;
    }

    public void setServNombre(String servNombre) {
        this.servNombre = servNombre;
    }

    public String getServConte() {
        return servConte;
    }

    public void setServConte(String servConte) {
        this.servConte = servConte;
    }

    public Double getServPrecio() {
        return servPrecio;
    }

    public void setServPrecio(Double servPrecio) {
        this.servPrecio = servPrecio;
    }



private String servNombre;
private String servConte; 
private Double servPrecio;

//-------------------- empieza cod Clientes-----------
 public int getClienid() {
        return Clienid;
    }

    public void setClienid(int Clienid) {
        this.Clienid = Clienid;
    }

    public String getClienNombre() {
        return ClienNombre;
    }

    public void setClienNombre(String ClienNombre) {
        this.ClienNombre = ClienNombre;
    }

    public String getClienApePat() {
        return ClienApePat;
    }

    public void setClienApePat(String ClienApePat) {
        this.ClienApePat = ClienApePat;
    }

    public String getClienApeMat() {
        return ClienApeMat;
    }

    public void setClienApeMat(String ClienApeMat) {
        this.ClienApeMat = ClienApeMat;
    }

    public String getClienDni() {
        return ClienDni;
    }

    public void setClienDni(String ClienDni) {
        this.ClienDni = ClienDni;
    }

    public String getClienEd() {
        return ClienEd;
    }

    public void setClienEd(String ClienEd) {
        this.ClienEd = ClienEd;
    }

    public String getClienTel() {
        return ClienTel;
    }

    public void setClienTel(String ClienTel) {
        this.ClienTel = ClienTel;
    }

    public String getClienFech() {
        return ClienFech;
    }

    public void setClienFech(String ClienFech) {
        this.ClienFech = ClienFech;
    }

    public String getClienCorreo() {
        return ClienCorreo;
    }

    public void setClienCorreo(String ClienCorreo) {
        this.ClienCorreo = ClienCorreo;
    }


    public String getCliendirec() {
        return Cliendirec;
    }

    public void setCliendirec(String Cliendirec) {
        this.Cliendirec = Cliendirec;
    }

    public String getClienPaq() {
        return ClienPaq;
    }

    public void setClienPaq(String ClienPaq) {
        this.ClienPaq = ClienPaq;
    }

    public String getClienCon() {
        return ClienCon;
    }

    public void setClienCon(String ClienCon) {
        this.ClienCon = ClienCon;
    }
    
    private int Clienid;
    private String ClienNombre;
    private String ClienApePat;
    private String ClienApeMat;
    private String ClienDni;
    private String ClienEd;
    private String ClienTel;
    private String ClienFech;
    private String ClienCorreo;
    private String ClienCon;
    private String Cliendirec;
    private String ClienPaq;

//----------------termina cod clientes-------------

//-------------Termina Servicios-----------

    private String Nombre;
    private String ApellidoPat;
    private String ApellidoMat;
    private String Dni;
    private String Fech;
    private float  Salario;
    private String Departa;
    
    private String  NombreDep;
    private String DescripDep;
    
    private int IdProyect;
    private String NombreProyect;
    private String DescriProyect;
    private float PresuProyect;
    private String FechaInProyect;
    private String FechaFinProyect;
    private String Estado;
    
    private String Rol;
    
    
    
    
}

