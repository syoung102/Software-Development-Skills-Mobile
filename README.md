# Software-Development-Skills-Mobile
### Software Development Skills: Mobile
### 001101681 Seoyoung Yun
Part 1, 2 and 3 are module tasks.
The Project task is in the Final project folder.

<br>

### An application about Everland
I made an application about Everland that is a famous amusement park in Korea.

It consists of a splash screen, a main screen, and a detail screen in this app.
- You can see the Everland logo image on the splash screen.
- You can check the information about rides or go to the website on the main screen.
- You can see a picture of the rides when you click the rides.

<br>

```java
public InfoAdapter(Context c, String[] r, int[] p) {
        rides = r;
        times = new String[p.length];
        for (int i = 0; i < p.length; i++) {
            t = p[i] * 2;
            times[i] = t + " minutes";
        }
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    } 
```
The waiting time is determined by the number of people. <br>
The resource file contains only the names of the rides and the number of people waiting.

<br>

### Learning Diary
[learning_diary_mobile.pdf](https://github.com/syoung102/Software-Development-Skills-Mobile/files/10043284/learning_diary_mobile.pdf)

<br>


### A video of your project running 
https://user-images.githubusercontent.com/88052367/202761384-eadbdca0-2d04-4bf1-ae33-11a5c28030a6.mp4



