CREATE TABLE IF NOT EXISTS "Content" ( 
	id INTEGER AUTO_INCREMENT PRIMARY KEY, 
	title VARCHAR(255) NOT NULL, 
	desc TEXT,
	status VARCHAR(20) NOT NULL, 
	content_type VARCHAR(50) NOT NULL, 
	date_created TIMESTAMP NOT NULL, 
	date_updated TIMESTAMP,
	url VARCHAR(255)
);

INSERT INTO "Content" (title, desc, status, content_type, date_created, date_updated, url)
VALUES 
('Content Strategy 101', 'Introduction to content strategy', 'IDEA', 'ARTICLE', '2024-11-01 10:30:00', NULL, 'https://example.com/content-strategy-101'),
('Java Tutorials', 'Comprehensive Java tutorials for beginners', 'IN_PROGRESS', 'COURSE', '2024-10-20 14:45:00', '2024-11-01 12:00:00', 'https://example.com/java-tutorials'),
('Spring Boot Conference', 'Upcoming talk on Spring Boot', 'COMPLETED', 'CONFERENCE_TALK', '2024-09-15 09:00:00', '2024-10-01 15:30:00', 'https://example.com/spring-boot-conference'),
('Effective Video Marketing', 'Tips on creating engaging videos', 'PUBLISHED', 'VIDEO', '2024-06-01 08:00:00', '2024-06-10 17:00:00', 'https://example.com/video-marketing'),
('Microservices Architecture', 'Guide to building microservices', 'IN_PROGRESS', 'ARTICLE', '2024-11-01 11:00:00', NULL, 'https://example.com/microservices-architecture'),
('React for Beginners', 'Learn React step by step', 'IDEA', 'COURSE', '2024-11-09 13:20:00', NULL, 'https://example.com/react-for-beginners'),
('Mastering Kubernetes', 'Advanced Kubernetes course', 'COMPLETED', 'COURSE', '2024-05-10 14:00:00', '2024-08-20 18:00:00', 'https://example.com/mastering-kubernetes'),
('Cloud Native Patterns', 'Webinar on cloud-native development', 'PUBLISHED', 'CONFERENCE_TALK', '2024-07-25 10:00:00', '2024-08-01 16:30:00', 'https://example.com/cloud-native-patterns'),
('DevOps Best Practices', 'Comprehensive guide to DevOps', 'PUBLISHED', 'ARTICLE', '2024-03-01 09:00:00', '2024-03-10 15:00:00', 'https://example.com/devops-best-practices'),
('Building REST APIs', 'Learn to build RESTful APIs with Spring Boot', 'IDEA', 'VIDEO', '2024-11-09 14:45:00', NULL, 'https://example.com/building-rest-apis');
