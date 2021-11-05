/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria.domingo.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tutoria.domingo.interfaces.InterfaceCostume;
import tutoria.domingo.modelo.Mensaje;
import tutoria.domingo.modelo.Costume;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioCostume {
     @Autowired
    private InterfaceCostume crud;
    

    public List<Costume> getAll(){
        return (List<Costume>) crud.findAll();       
    }
    
    public Optional <Costume> getCostume(int id){
        return crud.findById(id);
    }
    
    public Costume save(Costume costume){
        return crud.save(costume);
    }
      public void delete(Costume costume){
        crud.delete(costume);
    }
    
    
}
