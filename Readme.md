# ObjectMapper
## to parsing data from json to object domain

```textmate
token:
eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTY2NDQ2MjEyOCwiZXhwIjoxNjY0NDY1NzI4LCJkYXRhIjpbeyJyb2xlcyI6WyJhZG1pbiIsIm1lbWJlciJdfV19.YrwB4s_pe6Gg9GwwFhVGv3JW7AumivKLGxFudSMNDRM

```

curl
```text
curl --location --request GET 'http://localhost:8080/getToken' \
--header 'X-Header-Id: 9c83b2cf-0ba9-4c60-bfd1-5604eb8b5672' \
--header 'testHeader: 9c83b2cf-0ba9-4c60-bfd1-5604eb8b5672' \
--header 'Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiYWRtaW4iOnRydWUsImlhdCI6MTY2NDQ2MjEyOCwiZXhwIjoxNjY0NDY1NzI4LCJkYXRhIjpbeyJyb2xlcyI6WyJhZG1pbiIsIm1lbWJlciJdfV19.YrwB4s_pe6Gg9GwwFhVGv3JW7AumivKLGxFudSMNDRM'


curl --location --request GET 'http://localhost:8080/hello' \
--header 'testHeader: 9c83b2cf-0ba9-4c60-bfd1-5604eb8b5672'

```

```textmate
    GET http://localhost:8080/hello

    GET http://localhost:8080/getToken
```