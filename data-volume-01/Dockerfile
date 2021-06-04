FROM node:14

WORKDIR /app

COPY package.json .

RUN npm install

COPY . .

VOLUME [ "/app/feedback" ]

CMD ["node","server.js"]