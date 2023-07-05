import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class RiskService {

    @Autowired
    private RiskRepository riskRepository;

    public Risk saveRisk(Risk risk) {
        return riskRepository.save(risk);
    }

    public Risk getRiskById(Long id) {
        return riskRepository.findById(id).orElse(null);
    }

    public List<Risk> getAllRisks() {
        return riskRepository.findAll();
    }

    public void deleteRisk(Long id) {
        riskRepository.deleteById(id);
    }
}

