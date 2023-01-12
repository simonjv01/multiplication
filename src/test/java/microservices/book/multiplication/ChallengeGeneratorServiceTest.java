package microservices.book.multiplication;

import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import microservices.book.multiplication.challenge.ChallengeGeneratorService;
import microservices.book.multiplication.challenge.ChallengeGeneratorServiceImpl;
import static org.mockito.BDDMockito.given;
import org.junit.jupiter.api.Test;

@ExtendWith(MockitoExtension.class)
public class ChallengeGeneratorServiceTest {

    private ChallengeGeneratorService challengeGeneratorService;

    @Spy
    private Random random;

    @BeforeEach
    public void setUp() {
        challengeGeneratorService = 
        new ChallengeGeneratorServiceImpl(random);
         
            
        }

    @Test
    public void generateRandomFactorIsBetweenExpectedLimits() {
        given(random.nextInt(89)).willReturn(20, 30);

    }
    }
    

