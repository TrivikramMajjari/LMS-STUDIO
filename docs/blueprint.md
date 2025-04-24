# **App Name**: SkillBuilder

## Core Features:

- Authentication Module: Landing page with signup/login options to authenticate users.
- Course Recommendations: Display a list of recommended courses based on user preferences.
- Daily Progress Tracker: Allow learners to track their daily learning progress to maintain consistency.

## Style Guidelines:

- Primary color: Use a calming blue (#3498db) to inspire trust and stability.
- Secondary color: Use a light gray (#f2f2f2) for backgrounds to ensure readability.
- Accent: Use a vibrant green (#2ecc71) for success messages and progress indicators.
- Clean and intuitive layout with clear navigation for easy access to courses and resources.
- Consistent use of simple, modern icons to represent course categories and features.
- Subtle transitions and animations to provide feedback and enhance user experience.

## Original User Request:
Problem Statement 9: 
Scenario: The shift toward digital learning has opened up new opportunities for students but has also introduced significant challenges. Many students struggle with staying organized, motivated, and engaged in their studies when they lack the structure of a traditional classroom environment. Managing multiple assignments, keeping track of deadlines, and finding reliable study resources can be overwhelming, particularly for students who are not accustomed to self-directed learning. Additionally, the absence of in-person interactions with teachers and peers can lead to feelings of isolation, further diminishing students' motivation and performance. While learning management systems (LMS) provide a basic framework for digital education, they often lack the personalization and support needed to address these individual challenges.

I'm providing organization, motivation, enagagement concepts can you create only the entities files required 

At  starting page learner should be signup and login then he will in homepage then he needs to go through few questions and then persolinized courses will shown for beginner, intermediate and advance level and course paths like fullstack java, devops, cloud architect. like that. then hw will see the full path to become. then he will enroll to the course and then see the course videos, quizzes, progress tracking, locking one module to another. and also whenever enrolls the course then he/she need to join the course community where all learners are present and discussing about common questions and queries and also in the course community subject matters are there and helps to resolve the queries in the course community page like chatroom.

This is about all organized and enagagement. Then we will go to motivation. We can include daily streaks and badges for completion of courses and we will include personalized visual dashboard where learners see their own current status about all their enrolled courses and pending works. 

This is all about the LMS project 
Technology Stack (Suggested)

- Backend: Spring Boot 
- Database: MySQL 



Homepage--->Signup/Login--->Personalized questions to learners----> recommended courses----> enroll multiple courses---> join course community for each course---->

src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── example/
│   │           └── lms/
│   │               ├── config/
│   │               │   └── SecurityConfig.java
│   │               ├── controller/
│   │               │   ├── AuthController.java
│   │               │   ├── CourseController.java
│   │               │   ├── EnrollmentController.java
│   │               │   ├── ProgressController.java
│   │               │   ├── CommunityController.java
│   │               │   ├── DashboardController.java
│   │               │   └── BadgeController.java
│   │               ├── dto/
│   │               │   ├── SignupRequest.java
│   │               │   ├── LoginRequest.java
│   │               │   └── PersonalizedQuestionnaireDto.java
│   │               ├── entity/
│   │               │   ├── User.java
│   │               │   ├── Role.java
│   │               │   ├── Course.java
│   │               │   ├── CoursePath.java
│   │               │   ├── Module.java
│   │               │   ├── Enrollment.java
│   │               │   ├── Progress.java
│   │               │   ├── Quiz.java
│   │               │   ├── QuizAttempt.java
│   │               │   ├── Badge.java
│   │               │   ├── Streak.java
│   │               │   ├── Community.java
│   │               │   ├── CommunityMessage.java
│   │               │   ├── SubjectMatterExpert.java
│   │               │   └── PersonalizedQuestionnaire.java
│   │               ├── repository/
│   │               │   ├── UserRepository.java
│   │               │   ├── RoleRepository.java
│   │               │   ├── CourseRepository.java
│   │               │   ├── CoursePathRepository.java
│   │               │   ├── ModuleRepository.java
│   │               │   ├── EnrollmentRepository.java
│   │               │   ├── ProgressRepository.java
│   │               │   ├── QuizRepository.java
│   │               │   ├── QuizAttemptRepository.java
│   │               │   ├── BadgeRepository.java
│   │               │   ├── StreakRepository.java
│   │               │   ├── CommunityRepository.java
│   │               │   ├── CommunityMessageRepository.java
│   │               │   ├── SubjectMatterExpertRepository.java
│   │               │   └── PersonalizedQuestionnaireRepository.java
│   │               ├── service/
│   │               │   ├── AuthService.java
│   │               │   ├── CourseService.java
│   │               │   ├── EnrollmentService.java
│   │               │   ├── ProgressService.java
│   │               │   ├── CommunityService.java
│   │               │   ├── DashboardService.java
│   │               │   └── BadgeService.java
│   │               └── LmsBackendApplication.java
│   └── resources/
│       ├── application.properties
│       └── data.sql
└── test/
    └── java/
        └── com/
            └── example/
                └── lms/
                    └── (test files)
pom.xml
README.md

add the backend files code only dont focus on frontend we will do it later
  