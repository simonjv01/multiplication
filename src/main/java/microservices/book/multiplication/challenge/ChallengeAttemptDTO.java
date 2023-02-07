package microservices.book.multiplication.challenge;

import javax.validation.constraints.*;
import lombok.Value;

@Value
public class ChallengeAttemptDTO {
    @Min(1) @Max(99)
    int factorA, factorB;
    @NotBlank
    String userAlias;
    @Positive(message = "How could you possibly get a negative result here? Try again.")
    int guess;

}
