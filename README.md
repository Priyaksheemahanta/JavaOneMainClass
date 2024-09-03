# JavaOneMainClass
JAVA One Main Class



<h2>Project Structure</h2>

<pre>
SimpleJavaProject/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── oneclass/
│                   ├── App.java
│                   ├── GreetingService.java
│                   └── User.java
│
├── pom.xml
└── README.md
</pre>

<h2>1. App.java</h2>

<p>This is the entry point of the application where the <code>main</code> method resides.</p>

<pre><code>package com.oneclass;

public class App {
    public static void main(String[] args) {
        // Create a user object
        User user = new User("John");

        // Create a greeting service object
        GreetingService greetingService = new GreetingService();

        // Print the greeting message
        System.out.println(greetingService.greet(user));
    }
}
</code></pre>

<h2>2. GreetingService.java</h2>

<p>This class provides a method to generate a greeting message.</p>

<pre><code>package com.oneclass;

public class GreetingService {
    public String greet(User user) {
        return "Hello, " + user.getName() + "! Welcome to the Simple Java Project.";
    }
}
</code></pre>

<h2>3. User.java</h2>

<p>This class represents a user with a name.</p>

<pre><code>package com.oneclass;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
</code></pre>

<h2>4. pom.xml</h2>

<p>The <code>pom.xml</code> file is the Maven Project Object Model configuration file. It manages dependencies, plugins, and build configurations.</p>

<pre><code>&lt;project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd"&gt;
    &lt;modelVersion&gt;4.0.0&lt;/modelVersion&gt;
    &lt;groupId&gt;com.oneclass&lt;/groupId&gt;
    &lt;artifactId&gt;one-class-java&lt;/artifactId&gt;
    &lt;packaging&gt;jar&lt;/packaging&gt;
    &lt;version&gt;1.0-SNAPSHOT&lt;/version&gt;
    &lt;name&gt;one-class-java&lt;/name&gt;

    &lt;properties&gt;
        &lt;maven.compiler.source&gt;1.8&lt;/maven.compiler.source&gt;
        &lt;maven.compiler.target&gt;1.8&lt;/maven.compiler.target&gt;
        &lt;!-- Define the main class here --&gt;
        &lt;!-- Change this to com.oneclass.AppTwo if you want to run AppTwo instead --&gt;
        &lt;mainClass&gt;com.oneclass.App&lt;/mainClass&gt;
    &lt;/properties&gt;

    &lt;build&gt;
        &lt;plugins&gt;
            &lt;plugin&gt;
                &lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;
                &lt;artifactId&gt;maven-jar-plugin&lt;/artifactId&gt;
                &lt;version&gt;3.1.0&lt;/version&gt;
                &lt;configuration&gt;
                    &lt;archive&gt;
                        &lt;manifest&gt;
                            &lt;!-- Specify the main class --&gt;
                            &lt;mainClass&gt;${mainClass}&lt;/mainClass&gt;
                        &lt;/manifest&gt;
                    &lt;/archive&gt;
                &lt;/configuration&gt;
            &lt;/plugin&gt;
        &lt;/plugins&gt;
    &lt;/build&gt;

    &lt;!-- Dependencies --&gt;
    &lt;dependencies&gt;
        &lt;!-- JUnit 5 API --&gt;
        &lt;dependency&gt;
            &lt;groupId&gt;org.junit.jupiter&lt;/groupId&gt;
            &lt;artifactId&gt;junit-jupiter-api&lt;/artifactId&gt;
            &lt;version&gt;5.8.1&lt;/version&gt;
            &lt;scope&gt;test&lt;/scope&gt;
        &lt;/dependency&gt;

        &lt;!-- JUnit 5 Engine --&gt;
        &lt;dependency&gt;
            &lt;groupId&gt;org.junit.jupiter&lt;/groupId&gt;
            &lt;artifactId&gt;junit-jupiter-engine&lt;/artifactId&gt;
            &lt;version&gt;5.8.1&lt;/version&gt;
            &lt;scope&gt;test&lt;/scope&gt;
        &lt;/dependency&gt;

        &lt;!-- JUnit 4 --&gt;
        &lt;dependency&gt;
            &lt;groupId&gt;junit&lt;/groupId&gt;
            &lt;artifactId&gt;junit&lt;/artifactId&gt;
            &lt;version&gt;4.13.2&lt;/version&gt;
            &lt;scope&gt;test&lt;/scope&gt;
        &lt;/dependency&gt;
    &lt;/dependencies&gt;
&lt;/project&gt;
</code></pre>

<h2>How to Run the Project</h2>

<ol>
    <li>
        <strong>Build the project:</strong><br>
        Use Maven to clean and package the project:
        <pre><code>mvn clean package</code></pre>
    </li>
    <li>
        <strong>Run the project:</strong><br>
        Execute the packaged JAR file:
        <pre><code>java -jar target/one-class-java-1.0-SNAPSHOT.jar</code></pre>
    </li>
</ol>


# JavaTwoMainClass
JAVA Two Main Class



<h2>Project Structure</h2>

<pre>
SimpleJavaProject/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── oneclass/
│                   ├── App.java
|                   ├── AppTwo.java    
│                   ├── GreetingService.java
│                   └── User.java
│
├── pom.xml
└── README.md
</pre>

<h2>1. App.java</h2>

<p>This is the entry point of the application where the <code>main</code> method resides.</p>

<pre><code>package com.oneclass;

public class App {
    public static void main(String[] args) {
        // Create a user object
        User user = new User("John");

        // Create a greeting service object
        GreetingService greetingService = new GreetingService();

        // Print the greeting message
        System.out.println(greetingService.greet(user));
    }
}
</code></pre>
<h2>2. pom.xml</h2>

<p>The <code>pom.xml</code> file is the Maven Project Object Model configuration file. It manages dependencies, plugins, and build configurations.</p>

<pre><code>&lt;project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd"&gt;
    &lt;modelVersion&gt;4.0.0&lt;/modelVersion&gt;
    &lt;groupId&gt;com.oneclass&lt;/groupId&gt;
    &lt;artifactId&gt;one-class-java&lt;/artifactId&gt;
    &lt;packaging&gt;jar&lt;/packaging&gt;
    &lt;version&gt;1.0-SNAPSHOT&lt;/version&gt;
    &lt;name&gt;one-class-java&lt;/name&gt;

    &lt;properties&gt;
        &lt;maven.compiler.source&gt;1.8&lt;/maven.compiler.source&gt;
        &lt;maven.compiler.target&gt;1.8&lt;/maven.compiler.target&gt;
        &lt;!-- Define the main class here --&gt;
        &lt;!-- Change this to com.oneclass.AppTwo if you want to run AppTwo instead --&gt;
        &lt;mainClass&gt;com.oneclass.AppTwo&lt;/mainClass&gt;
    &lt;/properties&gt;

    &lt;build&gt;
        &lt;plugins&gt;
            &lt;plugin&gt;
                &lt;groupId&gt;org.apache.maven.plugins&lt;/groupId&gt;
                &lt;artifactId&gt;maven-jar-plugin&lt;/artifactId&gt;
                &lt;version&gt;3.1.0&lt;/version&gt;
                &lt;configuration&gt;
                    &lt;archive&gt;
                        &lt;manifest&gt;
                            &lt;!-- Specify the main class --&gt;
                            &lt;mainClass&gt;$com.oneclass.AppTwo&lt;/mainClass&gt;
                        &lt;/manifest&gt;
                    &lt;/archive&gt;
                &lt;/configuration&gt;
            &lt;/plugin&gt;
        &lt;/plugins&gt;
    &lt;/build&gt;

</code></pre>
