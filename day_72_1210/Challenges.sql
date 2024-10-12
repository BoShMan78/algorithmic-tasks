// https://www.hackerrank.com/challenges/challenges/problem?isFullScreen=true

WITH ChallengeCounts AS (
    SELECT 
        h.hacker_id, 
        h.name, 
        COUNT(c.challenge_id) AS challenges_count
    FROM 
        hackers h
    JOIN 
        challenges c ON h.hacker_id = c.hacker_id
    GROUP BY 
        h.hacker_id, h.name
), MaxChallenges AS (
    SELECT MAX(challenges_count) AS max_challenges
    FROM ChallengeCounts
), FilteredChallenges AS (
    SELECT 
        cc.hacker_id, 
        cc.name, 
        cc.challenges_count
    FROM 
        ChallengeCounts cc
    WHERE 
        cc.challenges_count = (SELECT max_challenges FROM MaxChallenges)
        OR NOT EXISTS (
            SELECT 1 
            FROM ChallengeCounts cc2 
            WHERE cc2.challenges_count = cc.challenges_count 
            AND cc2.hacker_id <> cc.hacker_id
        )
)

SELECT hacker_id, name, challenges_count
FROM FilteredChallenges
ORDER BY challenges_count DESC, hacker_id ASC;
