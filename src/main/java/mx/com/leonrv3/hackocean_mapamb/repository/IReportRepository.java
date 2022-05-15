package mx.com.leonrv3.hackocean_mapamb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.leonrv3.hackocean_mapamb.domain.Report;

@Repository
public interface IReportRepository extends CrudRepository<Report, Long>{}
