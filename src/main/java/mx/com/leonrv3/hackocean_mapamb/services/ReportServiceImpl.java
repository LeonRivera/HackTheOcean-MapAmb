package mx.com.leonrv3.hackocean_mapamb.services;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.leonrv3.hackocean_mapamb.domain.Report;
import mx.com.leonrv3.hackocean_mapamb.repository.IReportRepository;

@Service
public class ReportServiceImpl implements IReportService{

    @Autowired
    private IReportRepository reportRepository;

    @Override
    public List<Report> listReports() {
        return (List<Report>) reportRepository.findAll();
    }

    @Override
    public void guardar(Report report) {
        reportRepository.save(report);
    }

    @Override
    public void eliminar(Report report) {
        reportRepository.delete(report);
    }

    @Override
    public Report findReport(Report report) {
       return reportRepository.findById(report.getId()).orElse(null);
    }
    
}
