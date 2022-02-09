# logback-exercise
Project to exercise logback a bit

## Setup

For the Mail Appender to work, you need to create following filter file under `src/main/filters/logback_exercise.properties`:
```properties
smtp.host=sample.host.net
smtp.port=587
smtp.username=user.name@domain.ch
smtp.password=supersecretpassword
smtp.address.to=user.destination@domain.ch
smtp.address.from=user.name@domain.ch
```

## Usage

To run this project simply build the `.jar` file with `mvn clean install`.

To run the `jar` file execute following command:
```bash
java -jar target/logback-exercise-1.0.0.jar
```

## Troubleshooting

### Google Mail

If you want to send logback mails over the Google SMTP, please make sure of following:

- You need to have [Less secure app access](https://myaccount.google.com/lesssecureapps) enabled.
- Make sure you use `25` as port and not `587`
