import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/risks")
public class RiskController {

    @Autowired
    private RiskService riskService;

    @PostMapping
    public Risk createRisk(@RequestBody Risk risk) {
        return riskService.saveRisk(risk);
    }

    @GetMapping("/{id}")
    public Risk getRisk(@PathVariable Long id) {
        return riskService.getRiskById(id);
    }

    @GetMapping
    public List<Risk> getAllRisks() {
        return riskService.getAllRisks();
    }

    @DeleteMapping("/{id}")
    public void deleteRisk(@PathVariable Long id) {
        riskService.deleteRisk(id);
    }
}

