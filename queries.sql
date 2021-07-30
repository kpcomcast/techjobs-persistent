## Part 1: Test it with SQL
SELECT COLUMN_NAME, DATA_TYPE from INFORMATION_SCHEMA.COLUMNS
WHERE table_schema = "techjobs" and table_name = "job";

## Part 2: Test it with SQL
SELECT name FROM techjobs.employer WHERE location="Saint Louis";

## Part 3: Test it with SQL
DROP TABLE `techjobs`.`job`;

## Part 4: Test it with SQL
SELECT DISTINCT name, description FROM techjobs.skill
INNER JOIN techjobs.job_skills
ON techjobs.skill.id = techjobs.job_skills.skills_id
ORDER BY name ASC;