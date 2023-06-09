package practicing.abstract_factory.factories;

import practicing.abstract_factory.chromosomes.Chromosome;
import practicing.abstract_factory.sex.Sex;

public interface HumanFactory {
    Chromosome setChromosome();

    Sex setSex();
}
