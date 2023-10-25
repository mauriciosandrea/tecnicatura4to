package utn.tienda_libros.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utn.tienda_libros.modelo.Libros;
import utn.tienda_libros.repositorio.LibroRepositorio;

import java.util.List;

@Service
public class LibroServicio implements IlibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;
    @Override
    public List<Libros> listarLibros() {
        return libroRepositorio.findAll();

    }

    @Override
    public Libros buscarLibroPorId(Integer IdLibro) {
        Libros libro = libroRepositorio.findById(IdLibro).orElse(null);
        return libro;
    }

    @Override
    public void guardarLibro(Libros libro) {
        libroRepositorio.save(libro);

    }

    @Override
    public void eliminarLibro(Libros libro) {
        libroRepositorio.delete(libro);

    }
}
