FROM node:20-alpine

WORKDIR /app

RUN npm install -g @angular/cli@18

COPY package*.json ./
RUN npm i

COPY . .

EXPOSE 4200

CMD ["ng", "serve", "--host", "0.0.0.0", "--poll=2000"]