/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tutoria.domingo.interfaces;

import org.springframework.data.repository.CrudRepository;
import tutoria.domingo.modelo.Costume;

/**
 *
 * @author USUARIO
 */
public interface InterfaceCostume extends CrudRepository<Costume,Integer> {
    
}
