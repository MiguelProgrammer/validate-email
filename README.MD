# Validação de email

### Aplicação criada para exemplificar o uso da api rest <a href="https://mails.so/">mail.so</a>.

#### Resumidamente, é inserido um email no path da api, é devolvido um objeto contendo as informações sobre o e-mail, abaixo exemplo. e.g;

#### E-mail válido
```
{
    "data": {
        "id": "5f127f26-09d3-48b4-97e1-a89df7278303",
        "email": "miguel.p7.silva@gmail.com",
        "username": "miguel.p7.silva",
        "domain": "gmail.com",
        "did_you_mean": null,
        "mx_record": "gmail-smtp-in.l.google.com",
        "provider": "gmail",
        "score": 100,
        "isv_format": true,
        "isv_domain": true,
        "isv_mx": true,
        "isv_noblock": true,
        "isv_nocatchall": true,
        "isv_nogeneric": true,
        "is_disposable": false,
        "is_free": true,
        "result": "deliverable",
        "reason": "accepted_email"
    },
    "error": null
}
```
#### Email inválido

```
{
    "data": {
        "id": "92f2c47f-20c4-42dc-af0d-7ee7b045b64c",
        "email": "miguel@gmail.com",
        "username": "miguel",
        "domain": "gmail.com",
        "did_you_mean": null,
        "mx_record": "gmail-smtp-in.l.google.com",
        "provider": "gmail",
        "score": 60,
        "isv_format": true,
        "isv_domain": true,
        "isv_mx": false,
        "isv_noblock": true,
        "isv_nocatchall": true,
        "isv_nogeneric": true,
        "is_disposable": false,
        "is_free": true,
        "result": "undeliverable",
        "reason": "rejected_email"
    },
    "error": null
}
```