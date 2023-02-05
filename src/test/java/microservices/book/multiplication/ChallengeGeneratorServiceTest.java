package microservices.book.multiplication;

import java.util.Random;

import microservices.book.multiplication.challenge.Challenge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import microservices.book.multiplication.challenge.ChallengeGeneratorService;
import microservices.book.multiplication.challenge.ChallengeGeneratorServiceImpl;

import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.BDDMockito.given;
import org.junit.jupiter.api.Test;

@ExtendWith(MockitoExtension.class)
public class ChallengeGeneratorServiceTest {

    public ChallengeGeneratorService challengeGeneratorService;

    @Mock
    public Random random;

    @BeforeEach
    public void setUp() {

        challengeGeneratorService = new ChallengeGeneratorServiceImpl(random);
    }

    @Test
    public void generateRandomFactorIsBetweenExpectedLimits() {
        // 89 is max - min range
        given(random.nextInt(89)).willReturn(20, 30);

        // when we generate a challenge
        Challenge challenge = challengeGeneratorService.randomChallenge();

        // then the challenge contains factors as expected
        then(challenge).isEqualTo(new Challenge(31, 41));
    }

    }



    

