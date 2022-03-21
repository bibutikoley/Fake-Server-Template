const {faker} = require('@faker-js/faker');

let database = {
    users: []
}

const threshold = 100;

for (let i = 0; i < threshold; i++) {
    database.users.push({
        id: faker.datatype.uuid(),
        name: faker.name.findName(),
        email: faker.internet.email(),
        age: faker.datatype.number({min: 18, max: 60, precision: 1}),
        phone: faker.phone.phoneNumber(),
        address: faker.address.streetAddress(),
        company: faker.company.companyName(),
        jobTitle: faker.name.jobTitle(),
        avatar: faker.image.avatar(),
        salary: "$" + faker.finance.amount() + "M",
    })
}

console.log(JSON.stringify(database, null, '\t'));