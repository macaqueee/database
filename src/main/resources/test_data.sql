 INSERT INTO groups(id,name) VALUES (1,'Asian');
 INSERT INTO groups(id,name) VALUES (2,'European');
 INSERT INTO groups(id,name) VALUES (3,'American');
 INSERT INTO groups(id,name) VALUES (4,'African');
 INSERT INTO groups(id,name) VALUES (5,'Australian');

 INSERT INTO subjects(id,name,description) VALUES (1,'Math','Algebra & Geometry');
 INSERT INTO subjects(id,name,description) VALUES (2,'History','History of the World');
 INSERT INTO subjects(id,name,description) VALUES (3,'Literature','Ukrainian & other');
 INSERT INTO subjects(id,name,description) VALUES (4,'English','English language');
 INSERT INTO subjects(id,name,description) VALUES (5,'Theoretical Physics','Physics. Only Physics');

 INSERT INTO students(id,name, group_id) VALUES (1,'Oleksii',2 );
 INSERT INTO students(id,name, group_id) VALUES (2,'Petro', 2);
 INSERT INTO students(id,name, group_id) VALUES (3,'Valera', 2);
 INSERT INTO students(id,name, group_id) VALUES (4,'Oleg', 2);

 INSERT INTO students(id,name, group_id) VALUES (5,'Chin Po', 1);
 INSERT INTO students(id,name, group_id) VALUES (6,'Chung Li', 1);
 INSERT INTO students(id,name, group_id) VALUES (7,'Kung Fu', 1);

 INSERT INTO students(id,name, group_id) VALUES (8,'Bred', 3);
 INSERT INTO students(id,name, group_id) VALUES (9,'Stan', 3);
 INSERT INTO students(id,name, group_id) VALUES (10,'Chad', 3);
 INSERT INTO students(id,name, group_id) VALUES (11,'Christian', 3);

 INSERT INTO students(id,name, group_id) VALUES (12,'Zulu', 4);
 INSERT INTO students(id,name, group_id) VALUES (13,'Ochoa', 4);
 INSERT INTO students(id,name, group_id) VALUES (14,'Lina', 4);

 INSERT INTO students(id,name, group_id) VALUES (15,'Damn', 5);
 INSERT INTO students(id,name, group_id) VALUES (16,'Devin', 5);
 INSERT INTO students(id,name, group_id) VALUES (17,'Kengoo', 5);

 INSERT INTO lectors(id,name, experience, subject_id) VALUES (1,'Martin King', 10, 2);
 INSERT INTO lectors(id,name, experience, subject_id) VALUES (2,'Edhar Po', 5, 3);
 INSERT INTO lectors(id,name, experience, subject_id) VALUES (3,'Euclid', 50, 1);
 INSERT INTO lectors(id,name, experience, subject_id) VALUES (4,'Pythagoras', 40, 1);
 INSERT INTO lectors(id,name, experience, subject_id) VALUES (5,'Alexander Pushkin', 25, 3);
 INSERT INTO lectors(id,name, experience, subject_id) VALUES (6,'Shakespeare', 15, 4);
 INSERT INTO lectors(id,name, experience, subject_id) VALUES (7,'Jack London', 23, 4);
 INSERT INTO lectors(id,name, experience, subject_id) VALUES (8,'Eisntein', 40, 5);
 INSERT INTO lectors(id,name, experience, subject_id) VALUES (9,'Isaak Newton', 23, 4);
 INSERT INTO lectors(id,name, experience, subject_id) VALUES (10,'Nikola Tesla', 60, 4);


 INSERT INTO studying_process (group_id, subject_id) VALUES (1,1);
 INSERT INTO studying_process (group_id, subject_id) VALUES (1,5);

 INSERT INTO studying_process (group_id, subject_id) VALUES (2,1);
 INSERT INTO studying_process (group_id, subject_id) VALUES (2,2);
 INSERT INTO studying_process (group_id, subject_id) VALUES (2,3);
 INSERT INTO studying_process (group_id, subject_id) VALUES (2,4);
 INSERT INTO studying_process (group_id, subject_id) VALUES (2,5);

 INSERT INTO studying_process (group_id, subject_id) VALUES (3,1);
 INSERT INTO studying_process (group_id, subject_id) VALUES (3,4);
 INSERT INTO studying_process (group_id, subject_id) VALUES (3,5);

 INSERT INTO studying_process (group_id, subject_id) VALUES (4,4);

 INSERT INTO studying_process (group_id, subject_id) VALUES (5,1);
 INSERT INTO studying_process (group_id, subject_id) VALUES (5,2);
 INSERT INTO studying_process (group_id, subject_id) VALUES (5,3);