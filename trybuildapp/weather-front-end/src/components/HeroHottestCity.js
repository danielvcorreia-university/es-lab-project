import React from 'react';
import WeatherService from '../services/WeatherService';

class HeroHottestCity extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            data:[]
        }
    }

    componentDidMount() {
        WeatherService.get_pt_hottest_city().then((response) => {
            this.setState({ data: response.data })
        });
    }

    render() {
        return (
            
            <div>
                <div className="jumbotron jumbotron-fluid">
                    <div className="container">
                        {
                            this.state.data.map(
                                city =>
                                <div key={city.id}>
                                    <h1 className="display-4">{city.cityname} obteve o maior registo de temperatura em Portugal neste mês</h1>                                   
                                    <p className="lead">Data: {city.publicationDateTime}</p>
                                    <p>Temperatura registada: {city.temp}ºC</p>
                                </div> 
                            )
                        }
                        
                    </div>
                </div>
            </div>
        )
    }
}

export default HeroHottestCity