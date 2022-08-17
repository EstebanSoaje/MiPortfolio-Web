
package com.tebo.tebo.Interface;

import com.tebo.tebo.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto, lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
