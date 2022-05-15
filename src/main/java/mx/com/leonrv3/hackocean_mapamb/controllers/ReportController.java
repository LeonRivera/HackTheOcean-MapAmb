package mx.com.leonrv3.hackocean_mapamb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.leonrv3.hackocean_mapamb.domain.Report;
import mx.com.leonrv3.hackocean_mapamb.services.IReportService;


@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH })
@RequestMapping("/mapamb")
public class ReportController {

    @Autowired
    IReportService reportService;

    @GetMapping(value="/saludo")
    public String saludar(){
        return "Holaaaaaaaaaaaaaaaaa xd";
    }
    
    @GetMapping(value="/reports")
    public List<Report> listReports() {
        return reportService.listReports();
    }

    @PostMapping(value = "/reports")
    public void newReport(@RequestBody Report report){
        reportService.guardar(report);
    }

    @DeleteMapping(value = "/reports/{id}")
    public void deleteReport(@PathVariable Long id){

        Report reporte = new Report();
        reporte.setId(id);
        reportService.eliminar(reporte);
        
    }


}
