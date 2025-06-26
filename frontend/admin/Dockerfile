FROM node:20-alpine as build
WORKDIR /app

COPY package*.json ./

RUN npm i

COPY . .

RUN npm run build -- --configuration=production

FROM nginx:alpine

COPY --from=build /app/dist/your-angular-app-name /usr/share/nginx/html

COPY nginx.conf /etc/nginx/conf.d/default.conf

EXPOSE 4200

CMD ["nginx", "-g", "daemon off;"]