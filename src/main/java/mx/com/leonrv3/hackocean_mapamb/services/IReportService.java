package mx.com.leonrv3.hackocean_mapamb.services;

import java.util.List;

import mx.com.leonrv3.hackocean_mapamb.domain.Report;

public interface IReportService {
    public List<Report> listReports();
    public void guardar(Report report);
    public void eliminar(Report report);
    public Report findReport(Report report);
}
