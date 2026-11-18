# LeetCode Hot 100

A lightweight Java project for solving, testing, and reviewing the LeetCode Hot 100 problems.

## Environment

- Java 17+
- Maven 3.9+
- JUnit 5

## Project structure

```text
.
├── docs
│   ├── methodology.md
│   ├── solutions
│   └── templates
├── src
│   ├── main/java/com/yewen/leetcode/hot100
│   │   ├── common
│   │   └── <topic>
│   └── test/java/com/yewen/leetcode/hot100
│       └── <topic>
└── pom.xml
```

Solution classes use the format `P<four-digit-number><EnglishTitle>`, for example `P0001TwoSum`.

## Run tests

```bash
mvn test
```

## Progress

| No. | Problem | Topic | Difficulty | Status | Solution | Notes | Last reviewed |
| ---: | --- | --- | --- | --- | --- | --- | --- |
| 1 | Two Sum | Hash Table | Easy | Done | [Java](src/main/java/com/yewen/leetcode/hot100/hash/P0001TwoSum.java) | - | 2026-11-18 |

### Status legend

- `Todo`: not started
- `Done`: solved independently
- `Review`: needs another attempt
- `Key`: important pattern or technique

