package controllers;

import entities.Supplier;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.SupplierService;

@RequestMapping("/suppliers")
@Controller
public class SupplierController {

    private final SupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    private String getAll(Model m) {
        m.addAttribute("clist", supplierService.getAll());
        return "suppliers";
    }

    @RequestMapping(value = "/insert/someone", method = RequestMethod.POST)
    private String insertPost(Model m, HttpServletRequest request) {
        String companyName = request.getParameter("companyName");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String iRoffice = request.getParameter("iRoffice");
        String zipCode = request.getParameter("zipCode");
        String city = request.getParameter("city");
        String country = request.getParameter("country");

        supplierService.insert(
                new Supplier(companyName,name,surname,iRoffice,zipCode,city,country )
        );

        return getAll(m);
    }

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    private String insertPage() {

        return "insert";
    }
}
