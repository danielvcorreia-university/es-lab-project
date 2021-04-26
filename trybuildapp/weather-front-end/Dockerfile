# pull official base image
FROM node:14.16.1-alpine
# set working directory
WORKDIR /weather-front-end
# add `/weather-front-end/node_modules/.bin` to $PATH
ENV PATH /weather-front-end/node_modules/.bin:$PATH
# install weather-front-end dependencies
COPY package.json ./
COPY package-lock.json ./
RUN npm install --silent
RUN npm install react-scripts@4.0.3 -g --silent
RUN npm install axios@0.21.1
RUN npm install bootstrap@4.6.0 --save
RUN npm install --save react-chartjs-2@2.11.1 chart.js@2.9.4

# add weather-front-end
COPY . ./
# start weather-front-end
CMD ["npm", "start"]