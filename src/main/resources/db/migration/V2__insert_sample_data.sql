INSERT INTO users (email, password, name, role)
VALUES ('admin@gmail.com', 'admin', 'Administrator', 'ROLE_ADMIN'),
       ('sing@gmail.com', 'secret', 'Sing', 'ROLE_USER');

INSERT INTO short_urls (short_key, original_url, created_by, created_at, expires_at, is_private, click_count)
VALUES ('rs1Aed', 'https://www.youtube.com/', 1, TIMESTAMP '2024-07-15', NULL, FALSE,
        0),
       ('hujfDf', 'https://github.com/', 1,
        TIMESTAMP '2024-07-16', NULL, FALSE, 0),
       ('ertcbn', 'https://nextjs.org/', 1, TIMESTAMP '2024-07-17', NULL, FALSE,
        0),
       ('edfrtg', 'https://tailwindcss.com/', 1, TIMESTAMP '2024-07-18',
        NULL, TRUE, 0),
       ('vbgtyh', 'https://www.docker.com/', 1, TIMESTAMP '2024-07-19', NULL, FALSE,
        0),
       ('rtyfgb', 'https://www.postgresql.org/', 1, TIMESTAMP '2024-07-25',
        NULL, FALSE, 0),
       ('rtvbop', 'https://www.python.org/', 1,
        TIMESTAMP '2024-07-26', NULL, FALSE, 0),
       ('2wedfg', 'https://aws.amazon.com/', 1, TIMESTAMP '2024-07-27', NULL,
        TRUE, 0),
       ('6yfrd4', 'https://open.spotify.com/search/tell%20me%20why', 1,
        TIMESTAMP '2024-07-28', NULL, FALSE, 0),
       ('r5t4tt', 'https://www.mongodb.com/', 1, TIMESTAMP '2024-07-29', NULL, FALSE,
        0),

       ('ffr4rt', 'https://kubernetes.io/', 1,
        TIMESTAMP '2024-08-10', NULL, FALSE, 0),
       ('9oui7u', 'https://nginx.org/', 1,
        TIMESTAMP '2024-08-11', NULL, FALSE, 0),
       ('cvbg5t', 'https://www.npmjs.com/', 1, TIMESTAMP '2024-08-12', NULL, FALSE,
        0),
       ('nm6ytf', 'https://modelcontextprotocol.io/introduction', 1,
        TIMESTAMP '2024-08-13', NULL, FALSE, 0),

       ('tt5y6r', 'https://github.com/naptha/tesseract.js', 1,
        TIMESTAMP '2024-08-14', NULL, FALSE, 0),
       ('fgghty', 'https://github.com/Sing07', 1,
        TIMESTAMP '2024-08-15', NULL, FALSE, 0)
;