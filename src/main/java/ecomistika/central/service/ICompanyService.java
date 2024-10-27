/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ecomistika.central.service;

import ecomistika.central.model.Category;
import ecomistika.central.model.Company;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Nicolas
 */
public interface ICompanyService {
    
        
    public List<Company> getAllCompanies();

    public Optional<Company> getCompanyById(Long id);

    public Company createCompany(Company company);

    public Company updateCompany(Company company);

    public void deleteCompany(Long id);
    
}
