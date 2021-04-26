import './App.css';
import PtCitiesTable from './components/PtCitiesTable';
import HeroHottestCity from './components/HeroHottestCity';
import Navbar from './components/Navbar';
import LineChartLisbon from './components/LineChartLisbon';
import LineChartPorto from './components/LineChartPorto';
import LineChartAveiro from './components/LineChartAveiro';
import LineChartFaro from './components/LineChartFaro';


function App() {
  return (
    <div className="App">
      <Navbar />
      <HeroHottestCity />

      <div className="row">
        <div className="col">
        </div>
        <div className="col-6">
          <PtCitiesTable />
        </div>
        <div className="col">
        </div>
      </div>

      <div className="row">
        <div className="col"></div>
        <div className="col-4">
          <LineChartLisbon />
        </div>
        <div className="col-4">
          <LineChartPorto />
        </div>
        <div className="col"></div>
      </div>

      <div className="row">
      <div className="col"></div>
        <div className="col-4">
          <LineChartAveiro />
        </div>
        <div className="col-4">
          <LineChartFaro />
        </div>
        <div className="col"></div>
      </div>
      
    </div>
  );
}

export default App;
