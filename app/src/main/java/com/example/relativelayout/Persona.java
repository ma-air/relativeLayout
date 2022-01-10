package com.example.relativelayout;

public class Persona {
    private int mId;
    private String Nombre;
    private String Cargo;
    private String Empresa;
    private int Foto;

    public Persona(int mId, String nombre, String cargo, String empresa, int foto) {
        this.mId = mId;
        Nombre = nombre;
        Cargo = cargo;
        Empresa = empresa;
        Foto = foto;
    }

    public int getmId() {
        return mId;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCargo() {
        return Cargo;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public int getFoto() {
        return Foto;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public void setFoto(int foto) {
        Foto = foto;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "mId=" + mId +
                ", Nombre='" + Nombre + '\'' +
                ", Cargo='" + Cargo + '\'' +
                ", Empresa='" + Empresa + '\'' +
                ", Foto=" + Foto +
                '}';
    }
}
