package microservices.book.multiplication.challenge;

public interface ChallengeService {

    /**
     * Verifies if an attempt coming from the presentation layer is correct or
     * not.
     * @return resultAttempt the resulting ChallengeAttempt object
     *
     */

    ChallengeAttempt verifyAttempt(
            ChallengeAttemptDTO resultAttempt);
}
