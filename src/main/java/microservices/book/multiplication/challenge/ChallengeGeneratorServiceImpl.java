package microservices.book.multiplication.challenge;

import org.springframework.stereotype.Service;

import javax.naming.ldap.PagedResultsControl;
import java.util.Random;

@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {

    public final static int MINIMUM_FACTOR = 11;
    public final static int MAXIMUM_FACTOR = 100;

    public final Random random;

    ChallengeGeneratorServiceImpl() {
        this.random = new Random();
    }

    public ChallengeGeneratorServiceImpl(final Random random) {
        this.random = random;
    }

    public int next() {
        return random.nextInt(MAXIMUM_FACTOR - MINIMUM_FACTOR) + MINIMUM_FACTOR;
    }

    @Override
    public Challenge randomChallenge() {
        return new Challenge(next(), next());
    }
    
}
