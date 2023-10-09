/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Crud;

import java.util.List;

/**
 *
 * @author Usuario
 */
public interface Crud<Class> {
    public boolean create(Class obj);
    public Class read(String id);
    public List<Class> readAll();
    public boolean update(Class obj);
    public boolean delete (Class obj);
    
}
