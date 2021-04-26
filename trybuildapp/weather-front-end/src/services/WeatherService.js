import axios from 'axios'

const WEATHER_CITIES_REST_API_URL = 'http://localhost:8080/pt'
const WEATHER_CITIES_REST_API_URL_LISBON_TEMP_HISTORY = 'http://localhost:8080/pt/lisboa'
const WEATHER_CITIES_REST_API_URL_PORTO_TEMP_HISTORY = 'http://localhost:8080/pt/porto'
const WEATHER_CITIES_REST_API_URL_AVEIRO_TEMP_HISTORY = 'http://localhost:8080/pt/aveiro'
const WEATHER_CITIES_REST_API_URL_FARO_TEMP_HISTORY = 'http://localhost:8080/pt/faro'
const WEATHER_CITIES_REST_API_URL_HOTTEST_CITY = 'http://localhost:8080/max'

class WeatherService {

    get_pt_cities() {
        return axios.get(WEATHER_CITIES_REST_API_URL);
    }

    get_temp_history_lisbon() {
        return axios.get(WEATHER_CITIES_REST_API_URL_LISBON_TEMP_HISTORY);
    }

    get_temp_history_porto() {
        return axios.get(WEATHER_CITIES_REST_API_URL_PORTO_TEMP_HISTORY);
    }

    get_temp_history_aveiro() {
        return axios.get(WEATHER_CITIES_REST_API_URL_AVEIRO_TEMP_HISTORY);
    }

    get_temp_history_faro() {
        return axios.get(WEATHER_CITIES_REST_API_URL_FARO_TEMP_HISTORY);
    }

    get_pt_hottest_city() {
        return axios.get(WEATHER_CITIES_REST_API_URL_HOTTEST_CITY);
    }
}

export default new WeatherService();