package utn.tienda_libros.servicio;

import utn.tienda_libros.modelo.Libros;

import java.util.List;

public interface IlibroServicio {

    public List<Libros>listarLibros();
    public  Libros buscarLibroPorId(Integer IdLibro);
    public void guardarLibro(Libros libro);
    public void eliminarLibro(Libros libro);

}
