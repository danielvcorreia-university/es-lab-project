import React from 'react';
import { Line } from 'react-chartjs-2';
import WeatherService from '../services/WeatherService';

class LineChartAveiro extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            data:[]
        }
    }

    componentDidMount() {
        WeatherService.get_temp_history_aveiro().then((response) => {
            this.setState({ data: response.data, isLoaded: true })
        });
    }

    getTemperatures() {
        const temperatures = [];
        
        for (let temp of this.state.data) {
            temperatures.push(temp.temp);
        }
    
        return temperatures;
    }

    getTimes() {
        const times = [];
        
        for (let time of this.state.data) {
            times.push(time.publicationDateTime);
        }

        return times;
    }

    render() {
        return (

            <div>
                {this.state.isLoaded ? <Line 
                data={{
                    labels: this.getTimes(),
                    datasets: [{
                        label: "Histórico de Temperaturas em Aveiro",
                        data: this.getTemperatures(),
                        backgroundColor: [
                            'rgba(75, 192, 192, 0.2)'
                        ],
                        borderColor: [
                            'rgba(75, 192, 192, 1)'
                        ],
                        borderWidth: 1
                    }],
                }}
                height={800}
                width={1000}
                options={{
                    scales: {
                        yAxes: [{
                            ticks: {
                                beginAtZero: true,
                            }
                        }]
                    }
                }}
            /> : <div> Still loading... </div> }
            </div>
        )
    }
}

export default LineChartAveiro