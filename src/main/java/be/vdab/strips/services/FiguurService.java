package be.vdab.strips.services;

import be.vdab.strips.domain.Figuur;
import be.vdab.strips.respositories.FiguurRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class FiguurService {
    private final FiguurRepository figuurRepository;

    public FiguurService(FiguurRepository figuurRepository) {
        this.figuurRepository = figuurRepository;
    }

    public List<Figuur> findAll() { return figuurRepository.findAll(); }
}
