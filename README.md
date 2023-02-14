Running selenium program from docker

Step1 : 
Install selenium/standalone-chrome from 
https://hub.docker.com/r/selenium/standalone-chrome
command: docker pull selenium/standalone-chrome


<img width="1272" alt="Screenshot 2023-01-03 at 11 53 40 AM" src="https://user-images.githubusercontent.com/19299232/210310739-ad15af7e-f09c-4fb4-8dce-ed47ec52dc71.png">


Step 2 : 
docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:latest

<img width="1792" alt="Screenshot 2023-01-03 at 11 57 13 AM" src="https://user-images.githubusercontent.com/19299232/210310757-3f32827e-6be7-4716-bdc6-bd27f84fae8f.png">


Step 3 : 
<img width="1100" alt="Screenshot 2023-01-03 at 12 15 43 PM" src="https://user-images.githubusercontent.com/19299232/210310890-d91e22a5-170a-43dc-b292-6cb56f6a5640.png">


