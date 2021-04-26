import React from 'react';
import WeatherService from '../services/WeatherService';

class PtCitiesTable extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            cities:[]
        }
    }

    componentDidMount() {
        WeatherService.get_pt_cities().then((response) => {
            this.setState({ cities: response.data })
        });
    }

    render() {
        return (

            <div>
                <br></br>
                <h1 className="center"> Portugal Condições Meteorológicas </h1>
                <br></br>
                <table className="table table-striped"> 
                    <thead>
                        <tr>

                            <td> Nome </td>
                            <td> Temperatura </td>
                            <td> Descrição </td>
                            <td> Humidade </td>
                            <td> Velocidade do vento </td>
                            <td> Percentagem de nuvens </td>
                            <td> Imagem </td>
                        </tr>
                    </thead>
                    <tbody>

                        {
                            this.state.cities.map(
                                city =>
                                <tr key={city.id}>
                                    <td> {city.name} </td>
                                    <td> {city.main.temp} </td>
                                    <td> {city.weather[0].description} </td>
                                    <td> {city.main.humidity}% </td>
                                    <td> {city.wind.speed} m/s </td>
                                    <td> {city.clouds.all}% </td>
                                    <td> <img src={ "images/" + city.weather[0].icon + ".png" } width="40" height="40" alt="weatherIcon"/> </td>
                                </tr> 
                            )
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}

export default PtCitiesTable